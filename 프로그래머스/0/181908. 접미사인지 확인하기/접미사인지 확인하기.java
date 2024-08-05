class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        return my_string.indexOf(is_suffix) != my_string.length()-is_suffix.length() ? 0 : 1;
    }
}