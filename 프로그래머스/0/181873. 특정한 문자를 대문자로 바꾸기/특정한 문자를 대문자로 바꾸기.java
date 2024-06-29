class Solution {
    public String solution(String str, String alp) {
        String result = str.replace(alp, alp.toUpperCase());
        
        return result;
    }
}