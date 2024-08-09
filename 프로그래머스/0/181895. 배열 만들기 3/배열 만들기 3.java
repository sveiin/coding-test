import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(int[] arr, int[][] intervals) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            for (int j = start; j <= end; j++) {
                result.add(arr[j]);
            }
        }
        
        return result;
    }
}