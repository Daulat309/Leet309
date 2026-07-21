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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        check(root, 0, targetSum, new ArrayList<Integer>());
        return list;
    }


    public void check(TreeNode root, int s, int k, List<Integer> ls){
        if(root==null) return;
        s += root.val;
        ls.add(root.val);
        if(root.left==null&&root.right==null){
            if(s==k){
                list.add(new ArrayList<>(ls));
            }
        }
        check(root.left, s, k, ls);
        check(root.right, s, k, ls);
        ls.remove(ls.size() - 1);
    }
}