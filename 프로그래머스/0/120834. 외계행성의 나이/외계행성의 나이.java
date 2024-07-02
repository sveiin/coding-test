class Solution {
    public String solution(int age) {
        String result = "";
        String strAge = String.valueOf(age);
        
        for (int i = 0; i < strAge.length(); i++) {
            result += (char) (strAge.charAt(i) - '0' + 'a');
        }
        
        return result;
    }
}