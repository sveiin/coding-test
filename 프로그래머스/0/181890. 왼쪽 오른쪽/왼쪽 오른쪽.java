import java.util.Arrays;

class Solution {
    public String[] solution(String[] strs) {

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("l")) {
                return Arrays.copyOfRange(strs, 0, i);
            }
            
            if (strs[i].equals("r")) {
                return Arrays.copyOfRange(strs, i + 1, strs.length);
            }
        }
        
        return new String[0];
    }
}