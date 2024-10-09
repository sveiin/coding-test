import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] commands) {
        int[] result = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int position = commands[i][2] - 1;
            
            int[] subArr = Arrays.copyOfRange(arr, start, end);
            Arrays.sort(subArr);
            result[i] = subArr[position];
        }
        
        return result;
    }
}