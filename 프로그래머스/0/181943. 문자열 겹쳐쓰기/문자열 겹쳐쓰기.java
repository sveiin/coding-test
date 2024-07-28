class Solution {
    public String solution(String str1, String str2, int s) {
        StringBuilder result = new StringBuilder();
        
        result.append(str1, 0, s);
        result.append(str2);
        result.append(str1, s + str2.length(), str1.length());
        
        return result.toString();
    }
}
