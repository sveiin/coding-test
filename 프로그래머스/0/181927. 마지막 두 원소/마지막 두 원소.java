import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            result.add(numbers[i]);
        }
        
        int last = numbers[numbers.length - 1];
        int secondLast = numbers[numbers.length - 2];
        
        if (last > secondLast) {
            result.add(last - secondLast);
        } else {
            result.add(last * 2);
        }
        
        return result;
    }
}