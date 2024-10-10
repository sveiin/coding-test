import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int result = -1;
        
        for (int num : arr) {
            int count = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, count);
            
            if (count > maxCount) {
                maxCount = count;
                result = num;
            } else if (count == maxCount) {
                result = -1;
            }
        }
        
        return result;
    }
}