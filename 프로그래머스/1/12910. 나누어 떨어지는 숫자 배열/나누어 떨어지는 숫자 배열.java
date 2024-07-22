import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
        
        Arrays.sort(arr);
        
        for (int n : arr) {
            if (n % divisor == 0) {
                result.add(n);
            }
        }
        
        if (result.size() == 0) {
            result.add(-1);
        }
        
        return result;
    }
}