class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[numbers.length];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers[numbers.length - 1 - i];
        }
        
        return result;
    }
}