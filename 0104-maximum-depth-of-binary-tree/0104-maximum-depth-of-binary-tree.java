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
    public int maxDepth(TreeNode root) {
        return check(root);
    }
    public int check(TreeNode root){
        if(root==null) return 0;
        int l = check(root.left);
        int r = check(root.right);
        int c  = l + r;
        return Math.max(l,r)+1;
    }
}