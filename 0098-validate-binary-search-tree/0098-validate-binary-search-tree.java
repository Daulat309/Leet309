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
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        ArrayList<Integer> list = new ArrayList<>();
        add(root,list);
        System.out.println(list);
        return is;
    }

    public void add(TreeNode root, ArrayList<Integer> list){
        if(root.left!=null) add(root.left, list);
        int a = root.val;
        if(!list.isEmpty()) {
            if(a<=list.get(list.size()-1)){
                is = false;
                return;
            }
        }
        list.add(a);
        if(root.right!=null) add(root.right, list);
    }
}