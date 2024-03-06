class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int countX = 0;
        int countY = 0;
        
        for(int i = 0; i<s.length(); i++){
            if(countX == countY){
                    answer++;
                    countX = 0;
                    countY = 0;
                    x = s.charAt(i);
                }
            if(s.charAt(i) == x){
                countX++; 
            }
            else{
                countY++;
            }
        }
        return answer;
    }
}