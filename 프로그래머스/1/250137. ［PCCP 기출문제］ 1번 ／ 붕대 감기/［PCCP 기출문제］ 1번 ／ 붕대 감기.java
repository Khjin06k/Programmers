class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int set = attacks[attacks.length-1][0]; // 마지막 공격
        
        int time = 0;
        int bonus = 0;
        int attack = 0;
        
        while(time != set){
            // 체력이 0이거나 죽는다면
            if(answer <= 0){
                return -1;
            }
            
            // 체력이 있다면
            // 몬스터가 공격하는 경우 - 체력 감소
            if(attacks[attack][0] == time){
                answer -= attacks[attack][1];
                bonus = 0;
                attack++;
            }else{
                bonus++;
                // 체력보다 더 업되는 경우 방지
                answer += bandage[1];
                // 연속 붕대 감기에 성공한 경우
                if(bonus == bandage[0]){
                    answer += bandage[2];
                    bonus = 0;
                } 
                if(answer > health) answer = health;
            }
            time++;
        }
        answer-=attacks[attack][1];
        return answer <= 0 ? -1 : answer;
    }
}