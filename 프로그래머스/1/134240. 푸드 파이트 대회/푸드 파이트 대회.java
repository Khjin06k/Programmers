import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i<food.length; i++){
            int a = food[i]/2;
            for(int j = 0; j<a; j++) answer += i;
        }
        
        StringBuffer str = new StringBuffer(answer);
        
        return answer+"0"+str.reverse().toString();
    }
}