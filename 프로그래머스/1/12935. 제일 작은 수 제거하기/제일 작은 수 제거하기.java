class Solution {
    public int[] solution(int[] arr) {
        int[] result;
        
        if (arr.length == 1) {
            result = new int[1];
            result[0] = -1;
            
            return result;
        }
        
        result = new int[arr.length - 1];
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            
            result[index] = arr[i];
            index++;
        }
        
        return result;
    }
}