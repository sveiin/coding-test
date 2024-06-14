import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        
        int[] newArr = Arrays.copyOf(arr, arr.length);
        
        Arrays.sort(newArr);
        
        int result = newArr[newArr.length / 2]; 
            
        return result;
    }
}