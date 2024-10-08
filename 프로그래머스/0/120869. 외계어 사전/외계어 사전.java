import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class Solution {
    public int solution(String[] spells, String[] dics) {

        for (String word : dics) {
            Set<String> wordSet = new HashSet<>();
            
            for (char c : word.toCharArray()) {
                wordSet.add(String.valueOf(c));
            }
            
            if (wordSet.containsAll(Arrays.asList(spells))) {
                return 1;
            }
        }
        
        return 2;
    }
}