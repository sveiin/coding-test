class Solution {
    public String solution(String str, int start, int end) {
        String prefix = str.substring(0, start);
        String middle = new StringBuilder(str.substring(start, end + 1)).reverse().toString();
        String suffix = str.substring(end + 1, str.length());
        
        return prefix + middle + suffix;
    }
}