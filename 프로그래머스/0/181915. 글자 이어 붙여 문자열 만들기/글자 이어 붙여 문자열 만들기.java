class Solution {
    public String solution(String str, int[] indexs) {
        String result = "";
        
        for (int i = 0; i < indexs.length; i++) {
            char c = str.charAt(indexs[i]);
            
            result += c;
        }
        
        return result;
    }
}
