class Solution {
    public String solution(String str) {
        String[] arr = str.split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        
        for (String s : arr) {
            int num = Integer.parseInt(s);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        return min + " " + max;
    }
}