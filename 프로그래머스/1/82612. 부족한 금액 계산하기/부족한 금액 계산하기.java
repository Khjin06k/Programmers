class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int init = price;
        for(int i = 0; i<count; i++){
            answer += price;
            price += init;
        }
        if(money >= answer) return 0;
        else return answer - money;
    }
}