class Solution {
    public String solution(String str, int[][] queries) {
        StringBuilder sb = new StringBuilder(str);
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            
            String reversed = new StringBuilder(sb.substring(start, end + 1)).reverse().toString();
            
            sb.replace(start, end + 1, reversed);
        }
        
        return sb.toString();
    }
}