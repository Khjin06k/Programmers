import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        int j = 0;
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i = 1; i<arr.length; i++){
            if(arr[i] == arr[i-1]) continue;
            else{
                list.add(arr[i]);
            }
        }
        
        answer = new int[list.size()];
        answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }
}