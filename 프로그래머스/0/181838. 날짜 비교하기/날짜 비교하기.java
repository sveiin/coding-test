class Solution {
    public int solution(int[] date1, int[] date2) {
        int result = 0;
        
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] != date2[i]) {
                result = date1[i] < date2[i] ? 1 : 0;
                break;
            }
        }
        
        return result;
    }
}