class Solution {
    public int solution(String binomial) {
        int result;
        
        String[] parts = binomial.split(" ");
        
        int a = Integer.parseInt(parts[0]);
        String op = parts[1];
        int b = Integer.parseInt(parts[2]);
        
        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else {
            result = a * b;
        }

        return result;
    }
}