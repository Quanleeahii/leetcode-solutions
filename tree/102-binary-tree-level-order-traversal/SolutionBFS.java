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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> ls = new ArrayList<>();
            int n = q.size();
            for(int i = 0; i < n; i++){
                TreeNode current = q.poll();
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
                ls.add(current.val);
            }
            list.add(ls);
        }
        return list;
    }
}