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
    public boolean isBalanced(TreeNode root) {
        boolean[] isBalancedBool = new boolean[1];
        isBalancedBool[0] = true;
        dfs(root, isBalancedBool);
        return isBalancedBool[0];
    }
    public int dfs(TreeNode curr, boolean[] isBalancedBool) {
        if(curr == null) return 0;
        int leftVal = dfs(curr.left, isBalancedBool);
        int rightVal = dfs(curr.right, isBalancedBool);
        if(Math.abs(leftVal-rightVal) > 1) {
            isBalancedBool[0] = false;
        }
        return 1 + Math.max(leftVal, rightVal);
    }
}
