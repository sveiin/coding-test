import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(n);
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            
            result.add(n);
        }
        
        return result;
    }
}