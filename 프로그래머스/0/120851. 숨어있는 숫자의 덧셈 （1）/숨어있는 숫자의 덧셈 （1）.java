class Solution {
    public int solution(String str) {
        int result = 0;
        
        for (char c : str.toCharArray()) {
            if (c >= '0' && c <= '9') {
                result += c - '0';
            }
        }
        
        return result;
    }
}