class Solution {
    public int solution(int n, int k) {
        k -= n / 10;
        
        int result = (12000 * n) + (2000 * k); 
        
        return result;
    }
}