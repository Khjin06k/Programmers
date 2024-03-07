class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        // survey와 choices의 결과에 따라 각 유형별 점수 측정
        int length = survey.length; // 길이
        // 점수 측정을 위한 배열 및 문자열
        int[] result = new int[8]; // RT CF JM AN
        String surveys = "RTCFJMAN";
        for(int i = 0; i<length; i++){
            int ch = choices[i];
            if(ch <= 4) {
                result[surveys.indexOf(survey[i].charAt(0))] += (4-choices[i]);
            }else{
                result[surveys.indexOf(survey[i].charAt(1))] += (choices[i]-4);
            }
        }
        for(int i = 0; i<8; i+=2){
            if(result[i] >= result[i+1]) answer += surveys.charAt(i);
            else answer += surveys.charAt(i+1);
        }
        
        return answer;
    }
}