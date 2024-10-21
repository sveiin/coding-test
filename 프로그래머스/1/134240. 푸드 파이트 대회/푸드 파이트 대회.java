class Solution {
    public String solution(int[] foods) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < foods.length; i++) {
            sb.append(String.valueOf(i).repeat(foods[i] / 2));
        }
        
        return sb.toString() + "0" + sb.reverse();
    }
}