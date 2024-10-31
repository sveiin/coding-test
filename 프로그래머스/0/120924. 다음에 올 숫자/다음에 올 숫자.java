class Solution {
    public int solution(int[] common) {
        int diff = common[1] - common[0];
        int lastElement = common[common.length - 1];
        
        if (common[2] - common[1] == diff) {
            return lastElement + diff;
        } else {
            int ratio = common[1] / common[0];
            return lastElement * ratio;
        }
    }
}