import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.fill(result, -1);
        
        Set<Integer> set = new HashSet<>();
        int index = 0;
        
        for (int num : arr) {
            if (set.add(num)) {
                result[index++] = num;
                if (set.size() == k) {
                    break;
                }
            }
        }
        
        return result;
    }
}