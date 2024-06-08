class Solution {
    public int solution(int[] arr) {
        
        int sumOdd = 0;
        int sumEven = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        
        int result = Math.max(sumOdd, sumEven);
        
        return result;
    }
}