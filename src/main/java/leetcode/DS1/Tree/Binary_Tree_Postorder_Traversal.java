package leetcode.DS1.Tree;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/binary-tree-postorder-traversal/
soln: refer preorder code

POSTORDER: LEFT-RIGHT-ROOT

 */
public class Binary_Tree_Postorder_Traversal {


    public static List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        postorder(root, res);

        return res;
    }

    private static void postorder(TreeNode root, List<Integer> res) {
        if (root == null)
            return;

        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(postorderTraversal(root));
    }
}
