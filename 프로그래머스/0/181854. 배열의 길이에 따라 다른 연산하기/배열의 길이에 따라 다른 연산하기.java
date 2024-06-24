import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] result = Arrays.copyOf(arr, arr.length);
        
        int index = (result.length % 2 == 0) ? 1 : 0;
        
        for (int i = index; i < result.length; i += 2) {
            result[i] += n;
        }
        
        return result;
    }
}