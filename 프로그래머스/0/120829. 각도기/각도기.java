class Solution {
    public int solution(int angle) {
        int result;
        
        if (angle < 90) {
            result = 1;
        } else if (angle == 90) {
            result = 2;
        } else if (angle < 180) {
            result = 3;
        } else {
            result = 4;
        }
        
        return result;
    }
}