class Solution {
    public int[] solution(int n, int m) {
        int a = n, b = m;
        
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        return new int[] { a, n * m / a };
    }
}