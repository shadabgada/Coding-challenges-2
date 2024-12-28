package leetcode.DS1.Tree;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/binary-tree-inorder-traversal/
soln: refer PreOrder code

InOrder = LEFT-ROOT-RIGHT

 */
public class Binary_Tree_Inorder_Traversal {
    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public static void inorder(TreeNode rootNode, List<Integer> res) {

        if (rootNode == null)
            return;

        inorder(rootNode.left, res);
        res.add(rootNode.val);
        inorder(rootNode.right, res);

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(root));
    }
}
