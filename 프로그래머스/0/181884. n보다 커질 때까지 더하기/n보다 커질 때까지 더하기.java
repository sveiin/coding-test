class Solution {
    public int solution(int[] arr, int n) {
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if (sum > n) {
                break;
            }
        }
        
        return sum;
    }
}