import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = { a, b, c, d };
        Arrays.sort(dice);
        
        int d0 = dice[0], d1 = dice[1], d2 = dice[2], d3 = dice[3];
        
        if (d0 == d3) {
            return 1111 * d0;
        }
        
        if (d0 == d2 || d1 == d3) {
            int p = d1;
            int q = (d0 == d1) ? d3 : d0;
            return (int) Math.pow(10 * p + q, 2);
        }
        
        if (d0 == d1 && d2 == d3) {
            return (d0 + d2) * Math.abs(d0 - d2);
        }
        
        if (d0 == d1) return d2 * d3;
        if (d1 == d2) return d0 * d3;
        if (d2 == d3) return d0 * d1;
        
        return d0;
    }
}