class Solution {
    public int solution(int a, int b, int c) {
        int result;
        
        int sum = a + b + c;
        int sumOfSquares = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int sumOfCubes = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        
        if (a == b && b == c) {
            result = sum * sumOfSquares * sumOfCubes;
        } else if (a == b || b == c || a == c) {
            result = sum * sumOfSquares;
        } else {
            result = sum;
        }
        
        return result;
    }
}