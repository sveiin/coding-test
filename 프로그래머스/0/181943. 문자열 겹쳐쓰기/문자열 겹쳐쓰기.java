class Solution {
    public String solution(String str1, String str2, int s) {
        StringBuilder result = new StringBuilder();
        
        result.append(str1.substring(0, s));
        result.append(str2);
        result.append(str1.substring(s + str2.length()));
        
        return result.toString();
    }
}