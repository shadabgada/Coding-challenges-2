package leetcode.DS1.Tree;

/*
https://leetcode.com/problems/invert-binary-tree/
solution: https://leetcode.com/problems/invert-binary-tree/solutions/62719/my-simple-recursion-java-solution/comments/64446
 */
public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        System.out.println(invertTree(root));
    }
}
