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
    boolean a = false;
    public boolean findTarget(TreeNode root, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        // find(root,k,map);
        find(root,k,set);
        return a;
    }

    public void find(TreeNode root, int x, HashSet<Integer> set){
        if(root==null) return;
        if(set.contains(x-root.val)) a = true;
        else set.add(root.val);
        find(root.left,x, set);
        find(root.right,x, set);
    }
}