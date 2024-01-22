class Solution {
    public int solution(int a, int b) {
        int before = Integer.parseInt(""+a+b);
        int after = 2*a*b;
        return before>after ? before : after;
    }
}