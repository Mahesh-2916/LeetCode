class Solution {
    public int sumRootToLeaf(TreeNode root) {
         return pathSumRootToLeaf(root, 0);
    }
    
    private int pathSumRootToLeaf(TreeNode root, int parentNodeSum){
        if(root == null) return 0;
        
        parentNodeSum = 2 * parentNodeSum + root.val;
        if(root.left == null && root.right == null){
            return parentNodeSum;
        }
        
        return pathSumRootToLeaf(root.left, parentNodeSum) + pathSumRootToLeaf(root.right, parentNodeSum);   
    }
}