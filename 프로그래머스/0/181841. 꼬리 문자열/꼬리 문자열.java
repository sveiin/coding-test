class Solution {
    public String solution(String[] arr, String ex) {
        String result = "";
        
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].contains(ex)) {
                result += arr[i];
            }
        }
        
        return result;
    }
}