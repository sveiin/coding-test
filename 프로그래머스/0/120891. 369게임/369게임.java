class Solution {
    public int solution(int number) {
        String strNum = String.valueOf(number);
        int count = 0;
        
        for (int i = 0; i < strNum.length(); i++) {
            char c = strNum.charAt(i);
            if (c == '3' || c == '6' || c == '9') {
                count++;
            }
        }
        
        return count;
    }
}