import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            int a = arr[i];
            if(!Arrays.stream(delete_list).anyMatch(j -> j == a)) list.add(a);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}