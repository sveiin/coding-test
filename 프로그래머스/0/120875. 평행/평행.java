class Solution {
    public int solution(int[][] dots) {
        int[][] pairs = {
            {0, 1, 2, 3},
            {0, 2, 1, 3},
            {0, 3, 1, 2}
        };

        for (int[] pair : pairs) {
            double slope1 = getSlope(dots[pair[0]], dots[pair[1]]);
            double slope2 = getSlope(dots[pair[2]], dots[pair[3]]);
            if (slope1 == slope2) {
                return 1;
            }
        }

        return 0;
    }

    private double getSlope(int[] p1, int[] p2) {
        return (double) (p2[1] - p1[1]) / (p2[0] - p1[0]);
    }
}