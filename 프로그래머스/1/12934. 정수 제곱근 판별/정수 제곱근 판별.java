class Solution {
    public long solution(long n) {
        long result = -1;
        
        double sqrt = Math.sqrt(n);
        
        if (sqrt % 1 == 0) {
            result = (long) Math.pow(sqrt + 1, 2);
        }
        
        return result;
    }
}