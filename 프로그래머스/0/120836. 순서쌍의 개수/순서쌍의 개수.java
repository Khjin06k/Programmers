class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n==1) return 1;
        if(n==2) return 2;
        for(int i = 2; i<n/2; i++){
            if(n%i == 0) answer++;
        }
        return answer+2+(n%2==0 ? 1 : 0);
    }
}