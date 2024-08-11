import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(String[] arr, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        
        for (String str : arr) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if (num > k) {
                result.add(num);
            }
        }
        
        return result;
    }
}