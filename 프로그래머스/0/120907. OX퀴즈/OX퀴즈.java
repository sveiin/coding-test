class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];
        
        for (int i = 0; i < result.length; i++) {
            String[] arr = quiz[i].split(" ");
            
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[2]);
            int z = Integer.parseInt(arr[4]);
            
            String operator = arr[1];
            
            result[i] = (operator.equals("+") ? x + y : x - y) == z ? "O" : "X";
        }
        
        return result;
    }
}