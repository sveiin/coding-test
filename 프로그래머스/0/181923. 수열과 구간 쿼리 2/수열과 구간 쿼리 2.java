class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int target = queries[i][2];
            int min = Integer.MAX_VALUE;
            
            for (int j = start; j <= end; j++) {
                if (arr[j] > target && arr[j] < min) {
                    min = arr[j];
                }
            }
            
            result[i] = (min == Integer.MAX_VALUE) ? -1 : min;
        }
        
        return result;
    }
}