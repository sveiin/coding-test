import java.util.*;

class Solution {
    public List solution(int[] numbers, int n) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i += n) {
            result.add(numbers[i]);
        }
        
        return result;
    }
}