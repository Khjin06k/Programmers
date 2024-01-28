class Solution {
    public int solution(String s) {
        return s.contains("-") ? -1*Integer.parseInt(s.substring(1)) : Integer.parseInt(s);
    }
}