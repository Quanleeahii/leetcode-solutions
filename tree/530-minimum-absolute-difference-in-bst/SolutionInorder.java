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
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(prev != null && root.val - prev.val <= minDifference){
            minDifference = root.val - prev.val;
        }
        prev = root;
        inorder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDifference;
    }
}