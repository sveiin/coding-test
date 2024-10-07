class Solution {
    public String[] solution(String[] picture, int n) {
        String[] result = new String[picture.length * n];
        
        int index = 0;
        
        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (char c : picture[i].toCharArray()) {
                sb.append(String.valueOf(c).repeat(n));
            }
            
            for (int j = 0; j < n; j++) {
                result[index++] = sb.toString();
            }
        }
        
        return result;
    }
}