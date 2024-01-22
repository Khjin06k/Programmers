class Solution {
    public int solution(int a, int b) {
        int before = Integer.parseInt(""+a+b);
        int after = Integer.parseInt(""+b+a);
        return before>after ? before : after;
    }
}