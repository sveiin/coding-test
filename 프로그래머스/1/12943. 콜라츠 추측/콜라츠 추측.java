class Solution {
    public int solution(long num) {
        int result = -1;
        
        for (int i = 0; i < 500; i++) {
            if (num == 1) {
                result = i;
                break;
            }
            
            num = (num % 2 == 0) ? (num / 2) : (num * 3 + 1);
        }
        
        return result;
    }
}