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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert2(root.left);
        invert2(root.right);
        return root;
    }

    // public void invert(TreeNode p, TreeNode q){
    //     if(p!=null) invert2(p);
    //     if(q!=null) invert2(p);
    // }
    public void invert2(TreeNode root) {
        if(root==null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert2(root.left);
        invert2(root.right);
    }
}