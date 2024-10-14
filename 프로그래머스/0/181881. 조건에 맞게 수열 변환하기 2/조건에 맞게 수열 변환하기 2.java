import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        
        while (true) {
            int[] previousArr = arr.clone();
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2; 
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            
            if (Arrays.equals(arr, previousArr)) {
                return count;
            }
            
            count++;
        }
    }
}