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
        List<TreeNode> list = new ArrayList<>();
        int a = lca(root,p,q,list);
        return list.get(0);
    }

    public int lca(TreeNode root, TreeNode p, TreeNode q,List<TreeNode> list) {
        if(root==null) return 0;
        int l = lca(root.left,p,q,list);
        int r = lca(root.right,p,q,list);
        int s = l + r;
        if(root==p||root==q) s++;
        if(s>=2&&list.isEmpty()) list.add(root);
        return s;
    }
}