package leetcode.DS1.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
https://leetcode.com/problems/binary-tree-level-order-traversal/
solution:
https://leetcode.com/problems/binary-tree-level-order-traversal/solutions/33562/java-1ms-dfs-recursive-solution-and-2ms-bfs-iterative-solution/
 */
public class Binary_Tree_Level_Order_Traversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        levelOrderHelper(root, res, 0);
        return res;
    }

    private static void levelOrderHelper(TreeNode root, List<List<Integer>> res, int level) {
        if (root == null)
            return;

        List<Integer> curr;
        if (level >= res.size()) {
            curr = new ArrayList<>();
            curr.add(root.val);
            res.add(curr);
        } else {
            curr = res.get(level);
            curr.add(root.val);
        }
        levelOrderHelper(root.left, res, level + 1);
        levelOrderHelper(root.right, res, level + 1);
    }


    public static List<List<Integer>> levelOrder_Iterative(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                currLevel.add(currNode.val);
                if (currNode.left != null)
                    queue.add(currNode.left);
                if (currNode.right != null)
                    queue.add(currNode.right);
            }
            res.add(currLevel);
        }
        return res;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        root.right.left.left = new TreeNode(29);
        root.right.left.right = new TreeNode(33);
        root.right.right.left = new TreeNode(41);
        root.right.right.right = new TreeNode(57);


        // recursive
        System.out.println(levelOrder(root));

        // iterative
//        System.out.println(levelOrder_Iterative(root));
    }
}
