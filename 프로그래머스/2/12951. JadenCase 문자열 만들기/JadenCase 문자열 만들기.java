class Solution {
    public String solution(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        
        String[] words = str.split(" ", -1);
        
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase());
            }
            sb.append(' ');
        }
        
        sb.deleteCharAt(sb.length() - 1);
        
        return sb.toString();
    }
}