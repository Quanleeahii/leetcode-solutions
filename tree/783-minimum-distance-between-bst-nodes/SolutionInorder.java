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
    int minDifference = Integer.MAX_VALUE;
    TreeNode prev = null;
    public void traverse(TreeNode root){
        if(root == null) return;
        traverse(root.left);
        if(prev != null) minDifference = Math.min(minDifference, root.val - prev.val);
        prev = root;
        traverse(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        traverse(root);
        return minDifference;
    }
}