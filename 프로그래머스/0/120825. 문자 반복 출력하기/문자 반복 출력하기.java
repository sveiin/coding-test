class Solution {
    public String solution(String str, int n) {
        StringBuilder result = new StringBuilder(str.length() * n);
        
        for (char c : str.toCharArray()) {
            result.append(String.valueOf(c).repeat(n));
        }
        
        return result.toString();
    }
}