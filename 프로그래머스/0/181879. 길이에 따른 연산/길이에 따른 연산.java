class Solution {
    public int solution(int[] numbers) {
        int result;
        
        if (numbers.length <= 10) {
            result = 1;
            for (int n : numbers) {
                result *= n;
            }
        } else {
            result = 0;
            for (int n : numbers) {
                result += n;
            }
        }
        
        return result;
    }
}