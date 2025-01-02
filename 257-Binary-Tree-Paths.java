/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, list, new ArrayList<>());
        return list;
    }

    private void dfs(TreeNode root, List<String> list, List<TreeNode> tempList){
        if(root == null){
            return;
        }
        tempList.add(root);
        if(root.left == null && root.right == null){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < tempList.size(); i++){
                sb.append(tempList.get(i).val);
                if(i != tempList.size() - 1) sb.append(\->\);
            }
            list.add(sb.toString());
        }
        dfs(root.left, list, tempList);
        dfs(root.right, list, tempList);
        tempList.remove(tempList.size() - 1);
    }
}