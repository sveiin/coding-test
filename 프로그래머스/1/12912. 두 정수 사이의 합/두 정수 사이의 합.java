class Solution {
    public long solution(int a, int b) {
        long result = 0;
        
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        
        for (int i = start; i <= end; i++) {
            result += i;
        }
        
        return result;
    }
}