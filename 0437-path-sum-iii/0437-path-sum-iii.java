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
    public int pathSum(TreeNode root, int ts) {
        if(root==null) return res;
        sum(root, (long)ts, 0);
        pathSum(root.left, ts);
        pathSum(root.right, ts);
        return res;
    }

    public void sum(TreeNode root, long sm, long csm){
        if(root==null) return;
        csm += root.val;
        if(csm==sm) res++;
        sum(root.left, sm, csm);
        sum(root.right, sm, csm);
    }
}