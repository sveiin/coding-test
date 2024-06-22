class Solution {
    public int solution(String str) {
        String[] strArr = str.split("");
        
        int sum = 0;
        
        for (int i = 0; i < strArr.length; i++) {
            int num = Integer.parseInt(strArr[i]);
            
            sum += num;
        }
        
        return sum;
    }
}