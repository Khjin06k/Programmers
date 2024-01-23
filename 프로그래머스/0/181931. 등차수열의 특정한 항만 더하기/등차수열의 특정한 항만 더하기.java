class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0; i<included.length; i++){
            if(included[i]) answer += cal(a, d, i+1);
        }
        return answer;
    }
    
    public int cal(int a, int d, int j){
        return a+(j-1)*d;
    }
}