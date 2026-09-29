class Solution {
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // A valid parentheses string must have even length
        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        return dfs(grid, 0, 0, 0, new Boolean[m][n][m + n]);
    }

    private boolean dfs(char[][] grid, int row, int col, int balance,
                        Boolean[][][] dp) {

        // Update balance based on current cell
        if (grid[row][col] == '(') {
            balance++;
        } else {
            balance--;
        }

        // Balance can never be negative
        if (balance < 0) {
            return false;
        }

        // Reached bottom-right
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return balance == 0;
        }

        // Already calculated
        if (dp[row][col][balance] != null) {
            return dp[row][col][balance];
        }

        boolean result = false;

        // Move down
        if (row + 1 < grid.length) {
            result = dfs(grid, row + 1, col, balance, dp);
        }

        // Move right
        if (!result && col + 1 < grid[0].length) {
            result = dfs(grid, row, col + 1, balance, dp);
        }

        dp[row][col][balance] = result;

        return result;
    }
}