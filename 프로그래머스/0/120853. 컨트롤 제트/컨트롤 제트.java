class Solution {
    public int solution(String str) {
        int result = 0;
        
        String[] arr = str.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                result -= Integer.parseInt(arr[i - 1]);
            } else {
                result += Integer.parseInt(arr[i]);
            }
        }
        
        return result;
    }
}