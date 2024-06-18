class Solution {
    public int solution(int a, int b) {
        int result;
        
        if (a % 2 == 0 && b % 2 == 0) {
            result = Math.abs(a - b);
        } else if (a % 2 == 0 || b % 2 == 0) {
            result = 2 * (a + b);
        } else {
            result = (a * a) + (b * b);
        }
        
        return result;
    }
}