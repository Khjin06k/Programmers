import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] list = {a, b, c, d};
        Arrays.sort(list);
        // 모든 주사위의 숫자가 동일하다면
        if(a==b && b==c && c==d){
            return 1111*list[0];
        
        // 세개의 숫자가 동일하다면
        }else if(list[0]==list[1]&&list[1]==list[2]){
            return (10*list[0]+list[3])*(10*list[0]+list[3]);
        }else if(list[1]==list[2]&&list[2]==list[3]){
            return (10*list[3]+list[0])*(10*list[3]+list[0]);
        }
        
        // 두 개의 숫자가 동일하다면 / 단, 둘둘 동일한 경우
        else if(list[0] == list[1] && list[2] == list[3]){
            return (list[0]+list[2])*(list[0]-list[3]>0?list[0]-list[3]:list[3]-list[0]);
        }else if(list[1] == list[2] && list[0] == list[3]){
            return (list[0]+list[1])*(list[0]-list[1]>0?list[0]-list[1]:list[1]-list[0]);
        }
        
        // 두 개의 숫자만 동일하다면
        else if(list[0] == list[1]){
            return list[2]*list[3];
        }else if(list[1] == list[2]){
            return list[0]*list[3];
        }else if(list[2] == list[3]){
            return list[1]*list[0];
        }
        return list[0];
    }
}