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
    boolean is = true;
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        check(root);
        return is;
    }

    public void check(TreeNode root){
        if(root==null) return;
        check(root.left);
        if(prev!=null&&root.val<=prev.val){
                is = false;
                return;
        }
        prev = root;
        check(root.right);
    }
}