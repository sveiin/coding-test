class Solution {
    public int[] solution(int start, int end) {
        
        int length = start - end + 1;
        
        int[] result = new int[length];
        
        for(int i = 0; i < result.length; i++) {
            result[i] = start - i;
        }
        
        return result;
    }
}
