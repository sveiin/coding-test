import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int[] temp = Arrays.copyOf(numbers, numbers.length);
        
        Arrays.sort(temp);
        
        int result = temp[temp.length - 1] * temp[temp.length - 2];
        
        return result;
    }
}