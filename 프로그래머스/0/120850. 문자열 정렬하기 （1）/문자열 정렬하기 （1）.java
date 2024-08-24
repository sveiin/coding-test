import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public List solution(String str) {
        List<Integer> result = new ArrayList<>();
        
        for (char c : str.toCharArray()) {
            if (c >= '0' & c <= '9') {
                result.add(c - '0');
            }
        }
        
        Collections.sort(result);
        
        return result;
    }
}