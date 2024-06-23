import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = Arrays.copyOf(arr, arr.length);
        
        if (k % 2 == 0) {
            for (int i = 0; i < result.length; i++) {
                result[i] += k;
            }
        } else {
            for (int i = 0; i < result.length; i++) {
                result[i] *= k;
            }
        }
        
        return result;
    }
}