class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] result = new int[2];
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        
        for (String input : keyinput) {
            switch (input) {
                case "up":
                    result[1] = Math.min(result[1] + 1, yLimit);
                    break;
                case "down":
                    result[1] = Math.max(result[1] - 1, -yLimit);
                    break;
                case "right":
                    result[0] = Math.min(result[0] + 1, xLimit);
                    break;
                case "left":
                    result[0] = Math.max(result[0] - 1, -xLimit);
                    break;
            }
        }
        
        return result;
    }
}