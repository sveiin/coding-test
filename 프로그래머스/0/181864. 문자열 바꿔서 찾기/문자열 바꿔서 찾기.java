class Solution {
    public int solution(String str, String pat) {
        String newStr = str.replace('A', 'X').replace('B', 'A').replace('X', 'B');
        
        int result = newStr.contains(pat) ? 1 : 0;
        
        return result;
    }
}