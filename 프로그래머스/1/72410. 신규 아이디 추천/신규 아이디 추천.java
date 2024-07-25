import java.util.*;

class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase(); // 1단계
        StringBuilder answer = new StringBuilder();

        for (char check : new_id.toCharArray()) {
            if ((check >= 'a' && check <= 'z') || (check >= '0' && check <= '9') || check == '-' || check == '_' || check == '.') {
                if (check == '.' && answer.length() > 0 && answer.charAt(answer.length() - 1) == '.') {
                    continue; // 연속된 마침표 생략
                }
                answer.append(check);
            }
        }

        // 처음과 끝의 마침표 제거
        if (answer.length() > 0 && answer.charAt(0) == '.') answer.deleteCharAt(0);
        if (answer.length() > 0 && answer.charAt(answer.length() - 1) == '.') answer.deleteCharAt(answer.length() - 1);

        if (answer.length() == 0) answer.append("aaa"); // 빈 문자열 처리

        // 16자 이상 자르고 마지막 마침표 제거
        if (answer.length() >= 16) {
            answer.setLength(15);
            if (answer.charAt(answer.length() - 1) == '.') answer.deleteCharAt(answer.length() - 1);
        }

        // 길이가 3 미만이면 마지막 문자 반복
        while (answer.length() < 3) {
            answer.append(answer.charAt(answer.length() - 1));
        }

        return answer.toString();
    }
}
