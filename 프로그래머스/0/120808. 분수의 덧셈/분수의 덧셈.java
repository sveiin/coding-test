class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = (numer1 * denom2) + (numer2 * denom1);
        
        int gcd = calculateGcd(denom, numer);
        
        return new int[] { numer / gcd, denom / gcd };
    }
    
    private int calculateGcd(int a, int b) {
        return b == 0 ? a : calculateGcd(b, a % b);
    }
}