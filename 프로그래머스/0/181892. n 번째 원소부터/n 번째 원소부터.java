class Solution {
    public int[] solution(int[] numbers, int n) {
        
        int length = numbers.length - n + 1;
        int[] result = new int[length];
        
        int count = n - 1;
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers[count];
            count++;
        }
        
        return result;
    }
}