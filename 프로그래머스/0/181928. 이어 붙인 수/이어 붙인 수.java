class Solution {
    public int solution(int[] num_list) {
        int before = 0;
        int after = 0;
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                after = after*10+num_list[i];
            }else{
                before = before*10+num_list[i];
            }
        }
        return after+before;
    }
}