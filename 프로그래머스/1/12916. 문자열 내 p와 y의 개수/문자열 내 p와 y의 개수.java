class Solution {
    boolean solution(String s) {
        s=s.toLowerCase();
        // p와 y가 모두 없는 경우
        if(!s.contains("p") && !s.contains("y")){
            return true;
        }else{
            // 둘 중 하나라도 포함되어 있다면
            int countY = 0;
            int countP = 0;
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == 'y') countY++;
                if(s.charAt(i) == 'p') countP++;
            }
            return countY == countP;
        }
    }
}