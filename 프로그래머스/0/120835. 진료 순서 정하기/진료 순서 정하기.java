import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortedArr = emergency.clone();
        Arrays.sort(sortedArr);
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sortedArr.length; i++) {
            map.put(sortedArr[i], sortedArr.length - i);
        }
        
        int[] result = new int[emergency.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = map.get(emergency[i]);
        }
        
        return result;
    }
}