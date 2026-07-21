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
        TreeNode left = root;
        while(left!=null){
            asc.push(left);
            left = left.left;
        }
        TreeNode right = root;
        while(right!=null){
            dsc.push(right);
            right = right.right;
        }

        left = getSmall();
        right = getBig();
        while((left.val<right.val)){
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
        TreeNode left = small.right;
        while(left!=null){
            asc.push(left);
            left = left.left;
        }
        return small;
    }

    public TreeNode getBig(){
        if(dsc.isEmpty()) return null;

        TreeNode big = dsc.pop();
        TreeNode right = big.left;
        while(right!=null){
            dsc.push(right);
            right = right.right;
        }
        return big;
    }
}