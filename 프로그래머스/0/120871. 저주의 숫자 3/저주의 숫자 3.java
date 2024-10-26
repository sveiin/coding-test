class Solution {
    public int solution(int n) {
        int result = 0;
        int count = 0;
        
        while (count < n) {
            result++;
            if (result % 3 != 0 && !String.valueOf(result).contains("3")) {
                count++;
            }
        }
        
        return result;
    }
}