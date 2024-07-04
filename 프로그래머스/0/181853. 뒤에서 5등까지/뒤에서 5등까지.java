import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        
        return Arrays.copyOf(numbers, 5);
    }
}