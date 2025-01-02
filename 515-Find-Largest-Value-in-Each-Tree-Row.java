class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelMax = Integer.MIN_VALUE, size = q.size();
            for (int i = 0; i < size; ++i) {
                TreeNode node = q.poll();
                levelMax = Math.max(levelMax, node.val);
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            result.add(levelMax);
        }
        return result;
    }
}