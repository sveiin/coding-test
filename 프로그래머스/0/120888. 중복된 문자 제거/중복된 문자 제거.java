import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String str) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (set.add(c)) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}