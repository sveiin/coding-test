import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String str) {
        int[] result = new int[str.length()];
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                result[i] = i - map.get(c);
            } else {
                result[i] = -1;
            }
            map.put(c, i);
        }
        
        return result;
    }
}