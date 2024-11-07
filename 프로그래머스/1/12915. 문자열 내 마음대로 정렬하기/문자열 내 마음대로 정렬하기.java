import java.util.Arrays;

class Solution {
    public String[] solution(String[] strs, int n) {    
        
        Arrays.sort(strs, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            }
            return Character.compare(a.charAt(n), b.charAt(n));
        });
        
        return strs;
    }
}