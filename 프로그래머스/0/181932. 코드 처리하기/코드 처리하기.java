class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String[] list = code.split("");
        for(int i = 0; i<list.length; i++){
            if(list[i].equals("1")) {
                if(mode == 1) mode = 0;
                else mode = 1;
            }else{
                if(mode == 0 && i%2 ==0) answer += list[i];
                else if(mode == 1 && i%2==1) answer += list[i];
            }
        }
        return answer.length()==0 ? "EMPTY" : answer;
    }
}