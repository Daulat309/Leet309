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
    public boolean findTarget(TreeNode root, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean[] is = new boolean[1];
        find(root,k,is,map);
        return is[0];
    }

    public void find(TreeNode root, int x, boolean[] a, HashMap<Integer,Integer> map){
        if(root==null) return;
        if(map.containsKey(x-root.val)) a[0] = true;
        else map.put(root.val,root.val);
        find(root.left,x,a,map);
        find(root.right,x,a,map);
    }
}