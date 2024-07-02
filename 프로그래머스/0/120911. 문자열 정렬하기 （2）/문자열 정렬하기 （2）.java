import java.util.Arrays;

class Solution {
    public String solution(String str) {
        String result = "";
        String[] arr = str.toLowerCase().split("");
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        
        return result;
    }
}