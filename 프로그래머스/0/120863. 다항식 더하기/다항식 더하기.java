class Solution {
    public String solution(String polynomial) {
        int xSum = 0;
        int constantSum = 0;
        
        for (String term : polynomial.split(" \\+ ")) {
            if (term.contains("x")) {
                xSum += term.equals("x") ? 1 : Integer.parseInt(term.replace("x", ""));
            } else {
                constantSum += Integer.parseInt(term);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if (xSum > 0) {
            sb.append(xSum == 1 ? "x" : xSum + "x");
        }
        
        if (constantSum > 0) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(constantSum);
        }
        
        return sb.toString();
    }
}