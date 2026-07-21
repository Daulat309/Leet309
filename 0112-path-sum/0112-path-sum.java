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
        check(root, 0, targetSum);
        return res;
    }

    public void check(TreeNode root, int s, int k){
        if(root==null) return;
        s += root.val;
        if(root.left==null&&root.right==null){
            if(s==k){
                res = true;
                return;
            }
        }
        check(root.left, s, k);
        check(root.right, s, k);
    }
}