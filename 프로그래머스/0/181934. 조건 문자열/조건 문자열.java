class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int result;
        
        if (n > m) {
            result = ineq.equals(">") ? 1 : 0;
        } else if (n < m) {
            result = ineq.equals("<") ? 1 : 0;
        } else {
            result = eq.equals("=") ? 1 : 0;
        }
        
        return result;
    }
}