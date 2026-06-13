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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        check(root, targetSum,list, l);
        return list;
    }

    public void check(TreeNode root, int x, List<List<Integer>> list, List<Integer> l){
        if(root==null) return;
        l.add(root.val);
        if(root.left==null&&root.right==null){
            if(root.val==x) list.add(new ArrayList<Integer>(l));
        }
        check(root.left, x-root.val, list,l);
        check(root.right, x-root.val,list,l);
        l.remove(l.size()-1);
    }
}