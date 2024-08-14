class Solution {
    public int solution(int start, int end, int k) {
        int result = 0;
        
        for (int i = start; i <= end; i++) {
            int num = i;
            
            while (num != 0) {
                if (num % 10 == k) {
                    result++;
                }
                
                num /= 10;
            }
        }
        
        return result;
    }
}