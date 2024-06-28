class Solution {
    public String[] solution(String[] str) {
        String[] result = new String[str.length];
        
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = str[i].toLowerCase();
            } else {
                result[i] = str[i].toUpperCase();
            }
        }
        
        return result;
    }
}