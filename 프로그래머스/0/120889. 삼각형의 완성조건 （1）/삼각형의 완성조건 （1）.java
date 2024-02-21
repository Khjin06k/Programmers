import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides); // 오름차순 정렬
        int answer = 0;
        answer = (sides[2] >= sides[0] + sides[1] ? 2 : 1);
        return answer;
    }
}