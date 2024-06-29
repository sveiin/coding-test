class Solution {
    public int solution(String str, String pat) {
        String newStr = str.toLowerCase();
        String newPat = pat.toLowerCase();
        
        int result = newStr.contains(newPat) ? 1 : 0;
        
        return result;
    }
}