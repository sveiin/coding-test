import java.util.Arrays;

class Solution {
    public String solution(String str) {
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(new String(arr));
        
        return sb.reverse().toString();
    }
}