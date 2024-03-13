import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int none = 0;
        // 로또 중 0번의 번호 개수 파악 및 최소 당첨 개수 파악
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0) none++;
            else{
                // count 값 오류 해결 필요.
                if(Arrays.stream(win_nums)
                            .boxed()
                            .collect(Collectors.toSet())
                            .contains(lottos[i])) count++;
                else continue;
            }   
        }
        
        // count, none의 숫자를 통해 최고/최저 순위 파악
        // 최저 순위 파악
        switch(count){
            case 0:
            case 1: answer[1] = 6; break;
            case 2: answer[1] = 5; break;
            case 3 : answer[1] = 4; break;
            case 4: answer[1] = 3; break;
            case 5: answer[1] = 2; break;
            case 6 : answer[1] = 1; break;
        }
        
        // 최고 순위 파악
        switch(count+none){
                case 0:
            case 1: answer[0] = 6; break;
            case 2: answer[0] = 5; break;
            case 3 : answer[0] = 4; break;
            case 4: answer[0] = 3; break;
            case 5: answer[0] = 2; break;
            case 6 : answer[0] = 1;break;
        }
        return answer;
    }
}