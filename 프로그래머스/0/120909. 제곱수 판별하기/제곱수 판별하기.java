import java.util.*;

class Solution {
    public int solution(int n) {
        if(Math.sqrt(n) - (int)Math.sqrt(n) != 0) return 2;
        return 1;
    }
}