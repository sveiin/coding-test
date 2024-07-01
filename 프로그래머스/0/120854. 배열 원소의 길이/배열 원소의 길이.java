class Solution {
    public int[] solution(String[] strs) {
        int[] result = new int[strs.length];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = strs[i].length();
        }
        
        return result;
    }
}