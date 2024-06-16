class Solution {
    public String solution(String str, int n) {
        int start = str.length() - n;
        String result = str.substring(start);
        
        return result;
    }
}