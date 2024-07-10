class Solution {
    public int[][] solution(int[] numbers, int n) {
        int[][] result = new int[numbers.length / n][n];
        
        int index = 0;
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = numbers[index];
                index++;
            }
        }
        
        return result;
    }
}