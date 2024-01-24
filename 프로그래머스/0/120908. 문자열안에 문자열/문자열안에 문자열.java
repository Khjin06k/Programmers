class Solution {
    public int solution(String str1, String str2) {
        str1.toUpperCase();
        str2.toUpperCase();
        if(str1.contains(str2)) return 1;
        return 2;
    }
}