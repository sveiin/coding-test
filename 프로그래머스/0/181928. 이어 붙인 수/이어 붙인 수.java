class Solution {
    public int solution(int[] numbers) {
        
        String odd = "";
        String even = "";
        
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        
        int result = Integer.parseInt(odd) + Integer.parseInt(even);
        
        return result;
    }
}