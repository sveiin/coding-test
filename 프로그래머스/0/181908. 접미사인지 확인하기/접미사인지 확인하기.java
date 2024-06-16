class Solution {
    public int solution(String str, String suffix) {
        int result;
        
        if (str.endsWith(suffix)) {
            result = 1;
        } else {
            result = 0;
        }
        
        return result;
    }
}