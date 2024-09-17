import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        
        Arrays.sort(arr);
        
        String sortedStr = new StringBuilder(new String(arr)).reverse().toString();
        
        return Long.parseLong(sortedStr);
    }
}