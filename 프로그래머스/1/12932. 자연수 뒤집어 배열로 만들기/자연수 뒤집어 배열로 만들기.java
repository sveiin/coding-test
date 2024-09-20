class Solution {
    public int[] solution(long n) {
        int[] result = new int[String.valueOf(n).length()];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (n % 10);
            n /= 10;
        }
        
        return result;
    }
}