class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        for(int i = 0; i<length/2; i++){
            int change = num_list[i];
            num_list[i] = num_list[length-i-1];
            num_list[length-1-i] = change;
        }
        return num_list;
    }
}