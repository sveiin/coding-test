class Solution {
    public int solution(String str, String prefix) {
        int result;
        
        if (str.startsWith(prefix)) {
            result = 1;
        } else {
            result = 0;
        }
        
        return result;
    }
}