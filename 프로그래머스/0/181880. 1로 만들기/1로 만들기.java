class Solution {
    public int solution(int[] numbers) {
        int result = 0;
        
        for (int num : numbers) {
            while (num != 1) {
                num /= 2;
                result++;
            }
        }
        
        return result;
    }
}