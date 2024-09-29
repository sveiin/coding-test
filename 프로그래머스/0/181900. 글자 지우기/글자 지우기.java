class Solution {
    public String solution(String str, int[] indices) {
        boolean[] shouldDelete = new boolean[str.length()];
        
        for (int index : indices) {
            shouldDelete[index] = true;
        }
        
        StringBuilder sb = new StringBuilder(str.length() - indices.length);
        
        for (int i = 0; i < str.length(); i++) {
            if (!shouldDelete[i]) {
                sb.append(str.charAt(i));
            }
        }
        
        return sb.toString();
    }
}