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
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dmtr(root,0);
        return res;
    }

    public int dmtr(TreeNode root, int cur){
        if(root==null) return 0;
        int lft = dmtr(root.left, cur);
        int rht = dmtr(root.right, cur);
        int sm = lft+rht;
        res = Math.max(res,sm);
        return  Math.max(lft, rht) + 1;
    }
}