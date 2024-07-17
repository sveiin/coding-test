import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int result = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i] - n) < Math.abs(result - n)) {
                result = array[i];
            }
        }
        
        return result;
    }
}