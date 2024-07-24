import java.util.*;

class Solution {
    public int solution(String s) {
        String[] numList = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        String anString = "";
        String str = "";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) < 65){ // 숫자일 경우 그냥 +
                anString += s.charAt(i);
            }else{
                str += s.charAt(i);
                if(Arrays.asList(numList).contains(str)){
                    int idx = Arrays.asList(numList).indexOf(str);
                    anString += idx;
                    str = "";
                }
            }
        }
        return Integer.parseInt(anString);
    }
}