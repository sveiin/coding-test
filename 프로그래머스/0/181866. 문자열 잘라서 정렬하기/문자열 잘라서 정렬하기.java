import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public List solution(String str) {
        List<String> result = new ArrayList<>();
        
        String[] arr = str.split("x");
        
        for (String s : arr) {
            if (!s.isEmpty()) {
                result.add(s);
            }
        }
        
        Collections.sort(result);
        
        return result;
    }
}