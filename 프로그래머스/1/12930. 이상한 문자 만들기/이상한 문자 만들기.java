class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean isUpper = true;
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                isUpper = true;
            } else {
                c = isUpper ? Character.toUpperCase(c) : Character.toLowerCase(c);
                isUpper = !isUpper;
            }
            
            result.append(c);
        }
        
        return result.toString();
    }
}