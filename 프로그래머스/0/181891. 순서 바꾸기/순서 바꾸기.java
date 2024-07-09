class Solution {
    public int[] solution(int[] numbers, int n) {
        int[] result = new int[numbers.length];
        
        int index = 0;
        
        for (int i = n; i < numbers.length; i++) {
            result[index] = numbers[i]; 
            index++;
        }
        
        for (int i = 0; i < n; i++) {
            result[index] = numbers[i];
            index++;
        }
        
        return result;
    }
}