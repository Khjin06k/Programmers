import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>(); // 파기애햐 하는 배열 번째를 담은 리스트
                
        // 약관 유효 기간 HashMap
        HashMap<String, Integer> hash = new HashMap<>();
        for(int i = 0; i<terms.length; i++){
            String a = terms[i].split(" ")[0];
            int b = Integer.parseInt(terms[i].split(" ")[1]);
            hash.put(a, b);
        }
                
        // 오늘 날짜
        String[] todayNum = today.split("\\.");
        int todayY = Integer.parseInt(todayNum[0]);
        int todayM = Integer.parseInt(todayNum[1]);
        int todayD = Integer.parseInt(todayNum[2]);
        
        // 유효기간 계산하기
        for(int i = 0; i<privacies.length; i++){
            int termDay = hash.get(privacies[i].split(" ")[1]);
            
            String[] priList = privacies[i].split(" ")[0].split("\\.");
            int priY = Integer.parseInt(priList[0]);
            int priM = Integer.parseInt(priList[1]);
            int priD = Integer.parseInt(priList[2]);
            
            int calY = termDay/12+priY;
            int calM = termDay%12 + priM;
            int calD = priD;
            
            if(calM > 12){
                calY = calY + calM/12;
                calM = calM%12;
            }
            
            if(calD-1 == 0){
                calD = 28;
                calM -= 1;
            }else{
                calD -= 1;
            }
            
            if(calM == 0){
                calM = 12;
                calY -= 1;
            }            
                       
            // 계산한 기간과 오늘 날짜 비교하기
            if (todayY > calY || (todayY == calY && todayM > calM) || (todayY == calY && todayM == calM && todayD > calD)) {
                list.add(i + 1);
            }

            
        }
        
        int[] answer = list.stream()
	        .mapToInt(Integer::intValue)
    	    .toArray();
        return answer;
    }
}