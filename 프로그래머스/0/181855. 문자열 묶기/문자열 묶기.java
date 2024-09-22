class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[30];
        int result = 0;
        
        for (String str : strArr) {
            int index = str.length() - 1;
            arr[index]++;
            result = Math.max(arr[index], result);
        }
        
        return result;
    }
}