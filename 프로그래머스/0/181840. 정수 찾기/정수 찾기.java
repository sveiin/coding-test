class Solution {
    public int solution(int[] numbers, int n) {
        int result = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                result = 1;
                break;
            }
        }
        
        return result;
    }
}