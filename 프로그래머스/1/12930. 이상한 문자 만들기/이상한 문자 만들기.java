class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase(); // 전체를 먼저 소문자로 변경
        /*String[] word = s.split(" ");
        for(int i = 0; i<word.length; i++){
            for(int j = 0; j<word[i].length(); j++){
                if(j%2==0) answer += (word[i].charAt(j)+"").toUpperCase();
                else answer += (word[i].charAt(j)+"");
            }
            answer += (i == word.length-1 ? "" : " ");
        }
        return answer;*/
        
        // 공백이 2개 이상인 경우 생각 필요
        int j = 0;
        for(int i = 0; i<s.length(); i++){
            if((s.charAt(i)+"").equals(" ")){
                answer += " ";
                j = 0;
            }else{
                answer += (j%2==0 ? (s.charAt(i)+"").toUpperCase() : s.charAt(i));
                j++;
            }
        }
        return answer;
    }
}