class Solution {
    public String solution(String phone) {
        int length = phone.length();
        StringBuilder result = new StringBuilder(length);
        
        result.append("*".repeat(length - 4));
        result.append(phone.substring(length - 4));

        return result.toString();
    }
}