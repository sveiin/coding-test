class Solution {
    public int solution(int[] numbers) {
        int result;
        
        int sum = 0;
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
        }
        
        if (sum * sum > product) {
            result = 1;
        } else {
            result = 0;
        }
            
        return result;
    }
}