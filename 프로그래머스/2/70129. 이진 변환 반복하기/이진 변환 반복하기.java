class Solution {
    public int[] solution(String str) {
        int count = 0;
        int zeroCount = 0;

        while (!str.equals("1")) {
            int originalLength = str.length();      
            
            str = str.replace("0", "");
            
            zeroCount += originalLength - str.length();
            
            str = Integer.toBinaryString(str.length());
            
            count++;
        }

        return new int[] { count, zeroCount };
    }
}