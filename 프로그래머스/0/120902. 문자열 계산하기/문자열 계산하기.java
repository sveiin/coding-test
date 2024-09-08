class Solution {
    public int solution(String str) {
        String[] arr = str.split(" ");
        int result = Integer.parseInt(arr[0]);
        
        for (int i = 1; i < arr.length; i += 2) {
            int num = Integer.parseInt(arr[i + 1]);
            result += (arr[i].charAt(0) == '+') ? num : -num;
        }
        
        return result;
    }
}