import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] cloth : clothes) {
            String category = cloth[1];
            map.put(category, map.getOrDefault(category, 0) + 1);
        }
        
        int total = 1;
        
        for (int count : map.values()) {
            total *= (count + 1);
        }
        
        total--;
        
        return total;
    }
}