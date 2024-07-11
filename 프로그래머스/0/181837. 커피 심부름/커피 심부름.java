class Solution {
    public int solution(String[] order) {
        int result = 0;
        
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("latte")) {
                result += 5000;
            } else {
                result += 4500;
            }
        }
        
        return result;
    }
}