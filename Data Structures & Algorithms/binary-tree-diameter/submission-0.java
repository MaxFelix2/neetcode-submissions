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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        dfs(root, res);
        return res[0];
        
    }
    public int dfs(TreeNode curr, int[] res) {
        if(curr == null) {
            return 0;
        }
        int leftval = dfs(curr.left, res);
        int rightval = dfs(curr.right, res);
        res[0] = Math.max(res[0], leftval+rightval);
        return 1 + Math.max(leftval, rightval);
    }  
}
