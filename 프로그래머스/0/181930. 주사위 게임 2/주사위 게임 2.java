class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        // 세 숫자가 모두 다르다면
        if(a != b && a != c && b != c){
            answer = third(a, b, c);
        }else if(a ==b && b == c){ // 세 숫자가 모두 같다면
            answer = once(a, b, c);
        } else answer = twice(a, b, c);
        return answer;
    }
    
    public int third(int a, int b, int c){
        return a+b+c;
    }
    
    public int twice(int a, int b, int c){
        return third(a, b, c)*(int)(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));
    }
    
    public int once(int a, int b, int c){
        return twice(a, b, c)*(int)(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3));
    }
}