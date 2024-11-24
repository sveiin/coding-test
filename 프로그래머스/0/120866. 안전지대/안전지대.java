class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] isDangerous = new boolean[n][n];
        
        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    isDangerous[i][j] = true;
                    for (int k = 0; k < dx.length; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                            isDangerous[nx][ny] = true;
                        }
                    }
                }
            }
        }
        
        int safeCount = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!isDangerous[i][j]) {
                    safeCount++;
                }
            }
        }
        
        return safeCount;
    }
}