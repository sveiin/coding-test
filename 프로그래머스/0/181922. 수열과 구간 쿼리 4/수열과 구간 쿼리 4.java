class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            int divisor = query[2];
            
            for (int i = start; i <= end; i++) {
                if (i % divisor == 0) {
                    arr[i]++;
                }
            }
        }
        
        return arr;
    }
}