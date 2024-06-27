class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[2];
        
        int odd = 0;
        int even = 0;
        
        for (int n : numbers) {
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        result[0] = even;
        result[1] = odd;
        
        return result;
    }
}