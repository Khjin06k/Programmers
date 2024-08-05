class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        int length = str.length;
        if(myString.charAt(myString.length()-1) == 'x') length += 1;
        int[] answer = new int[length];
        for(int i = 0; i<str.length; i++){
            answer[i] = str[i].length();
        }
        return answer;
    }
}