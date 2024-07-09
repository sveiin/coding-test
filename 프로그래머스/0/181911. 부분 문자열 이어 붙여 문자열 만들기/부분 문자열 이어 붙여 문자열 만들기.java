class Solution {
    public String solution(String[] strs, int[][] parts) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < strs.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1] + 1;
            
            String subStr = strs[i].substring(start, end);
            
            result.append(subStr);
        }
        
        return result.toString();
    }
}