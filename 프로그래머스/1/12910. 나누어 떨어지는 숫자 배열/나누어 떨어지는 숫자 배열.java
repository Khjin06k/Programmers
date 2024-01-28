import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i%divisor == 0) list.add(i);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        if(answer.length == 0) answer = new int[]{-1};
        Arrays.sort(answer);
        return answer;
    }
}