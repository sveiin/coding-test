class Solution {
    public long solution(int n, int m) {
        long result = 1;
        
        for (int i = 0; i < m; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        
        return result;
    }
}