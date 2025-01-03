class Solution {
    int dfs(TreeNode node, int maxVal) {
    if (node == null) {
        return 0; 
    }
    int count = 0;
    if (node.val >= maxVal) {
        count = 1; 
    }
    int newMax = (node.val > maxVal) ? node.val : maxVal;
    count += dfs(node.left, newMax);
    count += dfs(node.right, newMax);

    return count;
}
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);  
    }
}