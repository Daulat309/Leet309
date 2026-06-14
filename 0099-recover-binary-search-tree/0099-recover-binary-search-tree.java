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
    int cnt = 0;
    TreeNode fst = null;
    TreeNode scd = null;
    TreeNode prev = null;
    public void recoverTree(TreeNode root) {
        check(root);
        cnt = fst.val;
        fst.val = scd.val;
        scd.val = cnt;
    }

    public void check(TreeNode root){
        if(root==null) return;
        check(root.left);
        if(prev!=null&&root.val<=prev.val){
            if(cnt==0){
                fst = prev;
                scd = root;
                cnt++;
            }
            else {
            scd = root;
            return;
            }
        }
        
        prev = root;
        check(root.right);
    }
}