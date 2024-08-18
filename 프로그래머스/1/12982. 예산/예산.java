import java.util.Arrays;

class Solution {
    public int solution(int[] arr, int budget) {
        Arrays.sort(arr);
        int count = 0;
        
        for (int cost : arr) {
            if (budget < cost) {
                break;
            }
            
            budget -= cost;
            count++;
        }
        
        return count;
    }
}