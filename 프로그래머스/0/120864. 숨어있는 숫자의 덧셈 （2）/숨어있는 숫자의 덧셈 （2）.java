class Solution {
    public int solution(String str) {
        int result = 0;
        String[] arr = str.split("[a-zA-Z]+");
        
        for (String s : arr) {
            if (!s.equals("")) {
                result += Integer.parseInt(s);
            }
        }
        
        return result;
    }
}