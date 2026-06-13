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
    int n = 0;
    public int sumNumbers(TreeNode root) {
        check(root,0);
        return n;
    }
    public void check(TreeNode root, int x){
        if(root==null) return;
        x = x*10 + root.val;
        if(root.left==null&&root.right==null){
            n += x;
            return;
        }
        check(root.left,x);
        check(root.right,x);
    }
}