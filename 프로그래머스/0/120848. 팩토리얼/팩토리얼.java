class Solution {
    public int solution(int n) {
        int result;
        int factorial = 1;
        
        for (int i = 1; ; i++) {
            factorial *= i;
            
            if (factorial == n) {
                result = i;
                break;
            } else if (factorial > n) {
                result = i - 1;
                break;
            }
        }
        
        return result;
    }
}