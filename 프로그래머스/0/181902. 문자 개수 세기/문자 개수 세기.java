class Solution {
    public int[] solution(String str) {
        int[] result = new int[52];
        
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result[c - 'A']++;
            } else {
                result[c - 'a' + 26]++;
            }
        }
        
        return result;
    }
}