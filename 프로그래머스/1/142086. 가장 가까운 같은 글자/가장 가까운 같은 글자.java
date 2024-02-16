import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<String> list = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(!list.contains(s.charAt(i)+"")) answer[i] = -1;
            else {
                
                answer[i] = i-list.lastIndexOf(s.charAt(i)+"");
            }
            list.add(s.charAt(i)+"");
        }
        return answer;
    }
}