class Solution {
    public int solution(int n) {
        int i = 2;
        while(true){
            if((n-1)%i==0) return i;
            else i++;
        }
    }
}