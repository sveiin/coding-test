class Solution {
    public int solution(int[] dot) {
        int result;
        
        int x = dot[0];
        int y = dot[1];
        
        if (x > 0) {
            result = (y > 0) ? 1 : 4;
        } else {
            result = (y > 0) ? 2 : 3;
        }
        
        return result;
    }
}