import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        List<String> list = new ArrayList<>();
        while(n!=0){
            list.add(n%10+"");
            n /= 10;
        }
        answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = Integer.parseInt(list.get(i));
        }
        return answer;
    }
}