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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int x = Math.min(p.val,q.val);
        int y = Math.max(p.val,q.val);
        if((root.val>x&&y>root.val)||(x==root.val||root.val==y)) return root;
        if(root.val>x&&root.val>y) return lowestCommonAncestor(root.left, p, q);
        //if(root.val>q.val&&q.val>p.val) return lowestCommonAncestor(root.left, p, q);
        return lowestCommonAncestor(root.right, p, q);
    }
}