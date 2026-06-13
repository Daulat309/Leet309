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
    boolean res = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        check(root, targetSum, 0);
        return res;
    }

    public void check(TreeNode root, int x, int s){
        if(root==null) return;
        s += root.val;
        if(root.left==null&&root.right==null){
            if(s==x) res=true;
        }
        check(root.left, x, s);
        check(root.right, x, s);
    }
}