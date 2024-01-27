import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // score 배열을 정렬해서 가장 높은 사과 상자를 우선 확보
        Arrays.sort(score);
        
        List<Integer> list = new ArrayList<>();
        for(int i = score.length-1; i>=0; i--){
            if(list.size() == m){
                Collections.sort(list);  
                answer += list.get(0)*m;
                list = new ArrayList<>(); // 리스트 초기화
            }
            list.add(score[i]);
        }
         if(list.size() == m){
                Collections.sort(list);  
                answer += list.get(0)*m;
            }
        
        return answer;
    }
}