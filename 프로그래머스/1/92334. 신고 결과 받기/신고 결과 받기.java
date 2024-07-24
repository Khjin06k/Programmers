import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {        
        // 유저 별 경고 횟수 count
        int[] warning = new int[id_list.length];
        
        // 유저가 신고한 ID 목록
        HashSet<String>[] warList = new HashSet[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            warList[i] = new HashSet<>();
        }
        
        // 중복 신고 제거
        HashSet<String> uniqueReports = new HashSet<>(Arrays.asList(report));

        for(String rep : uniqueReports){
            String[] part = rep.split(" ");
            int a = Arrays.asList(id_list).indexOf(part[0]); // 신고자
            int b = Arrays.asList(id_list).indexOf(part[1]); // 신고 당한사람
            warning[b]++;
            warList[a].add(part[1]);
        }
        
        // 경고자
        int[] answer = new int[id_list.length];
        
        for(int i = 0; i<warning.length; i++){
            for(int j = 0; j<warList.length; j++){
                if(warning[i] >= k){
                    if(warList[j].contains(id_list[i])){
                        answer[j]++;
                    }
                }
            }
            
        }
    
        return answer;
    }
}