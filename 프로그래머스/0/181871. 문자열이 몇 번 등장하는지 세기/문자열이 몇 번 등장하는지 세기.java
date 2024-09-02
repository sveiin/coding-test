class Solution {
    public int solution(String str, String pat) {
        int result = 0;
        int index = 0;
        
        while ((index = str.indexOf(pat, index)) != -1) {
            result++;
            index++;
        }
        
        return result;
    }
}