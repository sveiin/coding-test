class Solution {
    public int solution(int a, int b, int n) {
        int total = 0;

        while (n >= a) {
            int newBottles = (n / a) * b;
            total += newBottles;
            n = (n % a) + newBottles;
        }
        
        return total;
    }
}