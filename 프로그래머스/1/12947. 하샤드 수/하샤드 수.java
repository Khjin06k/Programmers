class Solution {
    public boolean solution(int x) {
        int init = x;
        int sum = 0;
        while(x != 0){
            sum += (x%10);
            x /= 10;
        }
        
        if(init%sum == 0) return true;
        else return false;
    }
}