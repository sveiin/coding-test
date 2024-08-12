class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        int[] arr = new int[26];
        
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                result.append((char) ('a' + i));
            }
        }
        
        return result.toString();
    }
}