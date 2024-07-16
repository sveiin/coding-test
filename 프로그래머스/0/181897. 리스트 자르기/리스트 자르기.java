import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] arr) {
        int[] result;
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if (n == 1) {
            result = Arrays.copyOfRange(arr, 0, b + 1);
        } else if (n == 2) {
            result = Arrays.copyOfRange(arr, a, arr.length);
        } else if (n == 3) {
            result = Arrays.copyOfRange(arr, a, b + 1);
        } else {
            int size = (b - a) / c + 1;
            result = new int[size];
            
            int index = 0;
            for (int i = a; i <= b; i += c) {
                result[index] = arr[i];
                index++;
            }
        }
        
        return result;
    }
}