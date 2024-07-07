class Solution {
    public String solution(String str, int m, int c) {
        String result = "";
        
        for (int i = c - 1; i < str.length(); i += m) {
            result += str.charAt(i);
        }
        
        return result;
    }
}