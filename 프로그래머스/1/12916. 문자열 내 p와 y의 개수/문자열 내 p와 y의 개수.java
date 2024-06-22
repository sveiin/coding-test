class Solution {
    boolean solution(String s) {
        String upperStr = s.toUpperCase();
        int pCount = 0;
        int yCount = 0;
        
        for (int i = 0; i < upperStr.length(); i++) {
            char ch = upperStr.charAt(i);
            if (ch == 'P') {
                pCount++;
            } else if (ch == 'Y') {
                yCount++;
            }
        }
        
        return pCount == yCount;
    }
}