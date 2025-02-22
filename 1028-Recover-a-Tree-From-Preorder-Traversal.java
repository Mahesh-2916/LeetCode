

public class Solution
{
    private LinkedList<int[]> nodeList = new LinkedList<>();

    public TreeNode recoverFromPreorder(String S)
    {
        parseInput(S);
        if (nodeList.isEmpty())
        {
            return null;
        }
        
        TreeNode root = new TreeNode(nodeList.removeFirst()[1]);
        buildTree(root, 0);
        
        return root;
    }

    private void buildTree(TreeNode parent, int depth)
    {
        if (!nodeList.isEmpty() && nodeList.peekFirst()[0] == depth + 1)
        {
            TreeNode leftChild = new TreeNode(nodeList.removeFirst()[1]);
            parent.left = leftChild;
            buildTree(leftChild, depth + 1);
        }
        
        if (!nodeList.isEmpty() && nodeList.peekFirst()[0] == depth + 1)
        {
            TreeNode rightChild = new TreeNode(nodeList.removeFirst()[1]);
            parent.right = rightChild;
            buildTree(rightChild, depth + 1);
        }
    }

    private void parseInput(String S)
    {
        int i = 0;
        while (i < S.length())
        {
            int depth = 0;
        
            while (i < S.length() && S.charAt(i) == '-')
            {
                depth++;
                i++;
            }
            int value = 0;
            
            while (i < S.length() && Character.isDigit(S.charAt(i)))
            {
                value = value * 10 + (S.charAt(i) - '0');
                i++;
            }
            
            nodeList.add(new int[]{depth, value});
        }
    }
}