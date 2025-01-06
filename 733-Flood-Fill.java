class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) {
            return image;
        }
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }private void dfs(int[][] image, int sr, int sc, int color, int cur) {
        
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }
        if(image[sr][sc] != cur) {
            return;
        }
        image[sr][sc] = color;
        dfs(image, sr - 1, sc, color, cur);  // Up
        dfs(image, sr + 1, sc, color, cur);  // Down
        dfs(image, sr, sc - 1, color, cur);  // Left
        dfs(image, sr, sc + 1, color, cur);  // Right
    }
}