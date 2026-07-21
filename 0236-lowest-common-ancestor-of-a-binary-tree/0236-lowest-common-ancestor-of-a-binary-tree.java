/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int res = lcnt(root, p, q);
        return lca;
    }

    public int lcnt(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return 0;
        int cnt = 0;
        if(root==p||root==q){
            cnt++;
        }
        int left = lcnt( root.left, p, q);
        int right = lcnt( root.right, p, q);
        cnt += left;
        cnt += right;
        if(cnt>=2) if(lca==null) lca = root;
        return cnt;
    }
}