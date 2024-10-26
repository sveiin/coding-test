import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] queries) {
        int start = 0;
        int end = arr.length;
        
        for (int i = 0; i < queries.length; i++) {
            if (i % 2 == 0) {
                end = start + queries[i] + 1;
            } else {
                start += queries[i];
            }
        }
        
        return Arrays.copyOfRange(arr, start, end);
    }
}