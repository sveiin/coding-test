class Solution {
    public String[] solution(String str, int n) {
        String[] result;
        
        if (str.length() % n == 0) {
            result = new String[str.length() / n];
        } else {
            result = new String[str.length() / n + 1];
        }
        
        for (int i = 0; i < result.length; i++) {
            int start = n * i;
            int end;
            
            if (start + n > str.length()) {
                end = str.length();
            } else {
                end = start + n;
            }
            
            result[i] = str.substring(start, end);
        }
        
        return result;
    }
}