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
        Stack<TreeNode> q = new Stack<>();
        add(root,list,q);
        System.out.println(list);
        return is;
    }

    public void add(TreeNode root, ArrayList<Integer> list, Stack<TreeNode> q){
        q.push(root);
        if(root.left!=null) add(root.left, list, q);
        int a = q.pop().val;
        if(!list.isEmpty()) if(a<=list.get(list.size()-1)) is = false;
        list.add(a);
        if(root.right!=null) add(root.right, list, q);
    }
}