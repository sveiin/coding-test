class Solution {
    public int solution(String t, String p) {
        int result = 0;
        long pNum = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long tNum = Long.parseLong(t.substring(i, i + p.length()));
            if (tNum <= pNum) {
                result++;
            }
        }
        
        return result;
    }
}