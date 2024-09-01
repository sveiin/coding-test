class Solution {
    public String solution(String str, String pat) {
        int index = str.lastIndexOf(pat);
        
        return str.substring(0, index + pat.length());
    }
}