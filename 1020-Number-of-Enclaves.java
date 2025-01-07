class Solution {
    int m, n;
    int[] xy = {0,1,0,-1,0};

    public int numEnclaves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        for (int i = 0; i < m; i++) {
            dfs(grid, i, 0);
            dfs(grid, i, n-1);
        }

        for (int j = 0; j < n; j++) {
            dfs(grid, 0, j);
            dfs(grid, m-1, j);
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count += grid[i][j];
            }
        }
        return count;
    }

    public void dfs(int[][] grid, int i, int j) {
        if (i<0 || j<0 || i>=m || j>=n || grid[i][j]==0) return;
        // visit
        grid[i][j] = 0;
        for (int k = 0; k < xy.length-1; k++) {
            int x = i + xy[k];
            int y = j + xy[k+1];
            dfs(grid, x, y);
        }
    }
}