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
    Stack<TreeNode> asc = new Stack<>();
    Stack<TreeNode> dsc = new Stack<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;

        pushleft(root);
        pushright(root);

        TreeNode left = getSmall();
        TreeNode right = getBig();
        while (left != null && right != null && left != right){
            int s = left.val + right.val;
            if(s==k) return true;
            if(s<k) left = getSmall();
            else right = getBig();
        }
        return false;

    }

    public TreeNode getSmall(){
        if(asc.isEmpty()) return null;

        TreeNode small = asc.pop();
        pushleft(small.right);
        return small;
    }

    public TreeNode getBig(){
        if(dsc.isEmpty()) return null;
        TreeNode big = dsc.pop();
        pushright(big.left);
        return big;
    }

    public void pushleft(TreeNode root){
        while(root!=null){
            asc.push(root);
            root = root.left;
        }
    }

    public void pushright(TreeNode root){
        while(root!=null){
            dsc.push(root);
            root = root.right;
        }
    }
}