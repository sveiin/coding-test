class Solution {
    public int solution(int[] numbers) {
        int result = 45;
        int sum = 0;
        
        for (int n : numbers) {
            sum += n;
        }
        
        return result - sum;
    }
}