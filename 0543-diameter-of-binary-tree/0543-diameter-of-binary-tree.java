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
    int mx = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        check(root,0);
        return mx;
    }

    public int check(TreeNode root, int k){
        if(root==null) return k;
        int l = check(root.left,k);
        int r = check(root.right,k);
        int c  = l + r;
        mx = Math.max(c,mx);
        return Math.max(l,r)+1;
    }
}