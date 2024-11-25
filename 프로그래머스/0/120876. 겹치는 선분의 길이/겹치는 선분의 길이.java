class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[200];
        
        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;
            for (int i = start; i < end; i++) {
                arr[i]++;
            }
        }
        
        int count = 0;
        
        for (int num : arr) {
            if (num >= 2) {
                count++;
            }
        }
        
        return count;
    }
}