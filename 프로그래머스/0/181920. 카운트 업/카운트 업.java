class Solution {
    public int[] solution(int start, int end) {
        
        int length = end - start + 1;
        int[] result = new int[length];
        
        for (int i = 0; i < length; i++) {
            result[i] = start + i;
        }
        
        return result;
    }
}