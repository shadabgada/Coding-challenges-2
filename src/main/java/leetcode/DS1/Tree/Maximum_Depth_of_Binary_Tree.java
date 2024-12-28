package leetcode.DS1.Tree;

/*
https://leetcode.com/problems/maximum-depth-of-binary-tree/
solution:
https://leetcode.com/problems/maximum-depth-of-binary-tree/solutions/1769344/java-c-easy-to-go-explanation-solution/
 */
public class Maximum_Depth_of_Binary_Tree {

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        /*
                 3
              9      20
                   15  7
                         8
         */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        System.out.println(maxDepth(root));

    }
}
