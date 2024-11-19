import java.util.Arrays;

class Solution {
    public int[] solution(int[][] scores) {
        int length = scores.length;

        double[] averages = new double[length];
        for (int i = 0; i < length; i++) {
            averages[i] = (scores[i][0] + scores[i][1]) / 2.0;
        }

        Integer[] indices = new Integer[length];
        for (int i = 0; i < length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Double.compare(averages[b], averages[a]));

        int[] ranks = new int[length];
        for (int i = 0; i < length; i++) {
            if (i > 0 && averages[indices[i]] == averages[indices[i - 1]]) {
                ranks[indices[i]] = ranks[indices[i - 1]];
            } else {
                ranks[indices[i]] = i + 1;
            }
        }

        return ranks;
    }
}