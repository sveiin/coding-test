import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int[] result = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            for (String person : photo[i]) {
                result[i] += map.getOrDefault(person, 0);
            }
        }
        
        return result;
    }
}