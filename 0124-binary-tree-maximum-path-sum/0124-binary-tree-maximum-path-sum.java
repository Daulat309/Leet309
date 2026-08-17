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
    int mx = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int f = dfs(root);
        return mx;
    }

    public int dfs(TreeNode root){
        if(root==null) return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);
        int lc = left+root.val;
        int rc = right+root.val;
        int c = Math.max(root.val, Math.max(lc, Math.max(rc, lc+rc-root.val)));
        mx = Math.max(c, mx);
        return Math.max(lc, Math.max(rc, root.val));
    }
}