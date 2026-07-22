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
    TreeNode prev = null;
    TreeNode first = null;
    TreeNode sec = null;
    public void recoverTree(TreeNode root) {
        recover(root);
        if(first!=null){
            int tmp = first.val;
            first.val = sec.val;
            sec.val = tmp;
        }
    }

    public void recover(TreeNode root) {
        if(root==null) return;
        recover(root.left);
        if(prev!=null){
            if(prev.val>=root.val){
                if(first==null){
                    first = prev;
                    sec = root;
                }
                else sec = root;
            }
        }
        prev = root;
        recover(root.right);
    }
}