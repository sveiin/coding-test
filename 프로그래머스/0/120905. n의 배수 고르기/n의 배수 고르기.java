import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            
            if (num % n == 0) {
                list.add(num);
            }
        }
        
        int[] result = new int[list.size()];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}