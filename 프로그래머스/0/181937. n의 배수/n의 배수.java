class Solution {
    public int solution(int num, int n) {
        int result;
        
        if (num % n == 0) {
            result = 1;
        } else {
            result = 0;
        }
        
        return result;
    }
}