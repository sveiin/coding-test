class Solution {
    public long solution(int price, int money, int count) {
        long result = 0;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        
        if (sum > money) {
            result = sum - money;
        } 
        
        return result;
    }
}