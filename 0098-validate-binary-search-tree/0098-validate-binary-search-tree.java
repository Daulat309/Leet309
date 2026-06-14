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
    boolean is = true;
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        ArrayList<Integer> list = new ArrayList<>();
        
        check(root);
        System.out.println(list);
        return is;
    }

    public void check(TreeNode root){
        if(root.left!=null)check(root.left);
        if(prev!=null){
            if(root.val<=prev.val){
                is = false;
                return;
            }
        }
        prev = root;
        if(root.right!=null) check(root.right);
    }
}