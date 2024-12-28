package leetcode.DS1.Tree;

/*
https://leetcode.com/problems/binary-tree-preorder-traversal/description/
solution:
clean code: https://leetcode.com/problems/binary-tree-preorder-traversal/solutions/45468/3-different-solutions/
bit hepful explaination: https://leetcode.com/problems/binary-tree-preorder-traversal/solutions/1321689/java-2-easy-approach-with-explanation-dsf-and-stack/


PreOrder: ROOT-LEFT-RIGHT
 */


import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Preorder_Traversal {


    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        preorder(root, res);

        return res;
    }

    public static void preorder(TreeNode root, List<Integer> res) {
        if (root == null)
            return;
        res.add(root.val);

        preorder(root.left, res);
        preorder(root.right, res);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(preorderTraversal(root));

    }
}
