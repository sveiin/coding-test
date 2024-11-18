class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int height = 3; height <= total / 3; height++) {
            if (total % height == 0) {
                int width = total / height;

                if (2 * width + 2 * height - 4 == brown) {
                    return new int[] { width, height };
                }
            }
        }

        return new int[0];
    }
}