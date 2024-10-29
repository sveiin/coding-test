class Solution {
    public String solution(String str, int n) {
        StringBuilder sb = new StringBuilder(str.length());
        
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                sb.append(' ');
            } else if (c >= 'A' && c <= 'Z') {
                sb.append((char) ((c + n - 'A') % 26 + 'A'));
            } else {
                sb.append((char) ((c + n - 'a') % 26 + 'a'));
            }
        }
        
        return sb.toString();
    }
}