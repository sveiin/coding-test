class Solution {
    public String solution(String str, int index1, int index2) {
        char[] arr = str.toCharArray();
        
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        
        return new String(arr);
    }
}