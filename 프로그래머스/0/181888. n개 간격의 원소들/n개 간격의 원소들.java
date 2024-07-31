import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length%n==0 ? num_list.length/n : num_list.length/n+1;
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i<len; i++){
            answer.add(num_list[i*n]); 
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}