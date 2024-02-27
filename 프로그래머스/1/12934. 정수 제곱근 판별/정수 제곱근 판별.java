
class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqr = Math.sqrt(n);
        if(sqr - (int)sqr == 0 ) return ((long)sqr+1)*((long)sqr+1);
        else return -1;
    }
}