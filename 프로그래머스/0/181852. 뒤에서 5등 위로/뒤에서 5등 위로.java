import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] temp = Arrays.copyOf(numbers, numbers.length);
        
        Arrays.sort(temp);
        
        int[] result = Arrays.copyOfRange(temp, 5, temp.length);
        
        return result;
    }
}