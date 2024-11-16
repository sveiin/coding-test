class Solution {
    public int solution(int n) {
        int result = n + 1;
        int targetCount = Integer.bitCount(n);
        
        while (Integer.bitCount(result) != targetCount) {
            result++;
        }
        
        return result;
    }
}