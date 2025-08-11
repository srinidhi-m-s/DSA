class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        return rec(grid, 0, 0, dp);
    }

    public int rec(int[][] grid, int i, int j, int[][] dp) {
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int down = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;

        if (i + 1 < grid.length) {
            down = rec(grid, i + 1, j, dp);
        }

        if (j + 1 < grid[0].length) {
            right = rec(grid, i, j + 1, dp);
        }

        
        dp[i][j] = grid[i][j] + Math.min(down, right);
        return dp[i][j];
    }
}
