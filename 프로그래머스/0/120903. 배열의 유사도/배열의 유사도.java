import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i= 0; i<s2.length; i++){
            answer += Arrays.asList(s1).contains(s2[i]) ? 1 : 0;
        }
        return answer;
    }
}