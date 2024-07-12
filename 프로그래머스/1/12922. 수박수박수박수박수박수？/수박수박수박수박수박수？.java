class Solution {
    public String solution(int n) {
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            str.append((i % 2 == 0) ? "수" : "박");
        }
        
        return str.toString();
    }
}