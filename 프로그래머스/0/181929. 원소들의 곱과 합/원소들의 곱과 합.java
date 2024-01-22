class Solution {
    public int solution(int[] num_list) {
        int before = 1;
        int after = 0;
        for(int i = 0; i<num_list.length; i++){
            before *= num_list[i];
            after += num_list[i];
        }
        if(before < after*after) return 1;
        else return 0;
    }
}