class Solution {
    public int[] solution(String str) {
        String[] temp = str.split("x", -1);
        int[] result = new int[temp.length];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i].length();
        }
        
        return result;
    }
}