class Solution {
    public int[] solution(int n) {
        int[] result;
        
        if (n % 2 == 0) {
            result = new int[n / 2];
        } else {
            result = new int[n / 2 + 1];
        }
        
        for (int i = 0; i < result.length; i++) {
            result[i] = (2 * i) + 1;
        }
        
        return result;
    }
}