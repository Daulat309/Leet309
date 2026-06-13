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
    public int sumNumbers(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        l.add(0);
        check(root,0, l);
        return l.get(0);
    }
    public void check(TreeNode root, int x, List<Integer> l){
        if(root==null) return;
        x = x*10 + root.val;
        if(root.left==null&&root.right==null){
            l.set(0,l.get(0)+x);
            return;
        }
        check(root.left,x,l);
        check(root.right,x,l);
    }
}