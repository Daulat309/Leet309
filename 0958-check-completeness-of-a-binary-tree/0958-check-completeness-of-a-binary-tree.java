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
    boolean isnulla = false;
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root==null) return true;
        q.offer(root);
        while(!q.isEmpty()){
            int l = q.size();
            while(l-->0){
                TreeNode p = q.poll();
                    if(p.left==null){
                        isnulla = true;
                    }
                    else {
                        if(isnulla) return false;
                        q.offer(p.left);
                    }
                    if(p.right==null){
                        isnulla = true;
                    }
                    else {
                        if(isnulla) return false;
                        q.offer(p.right);
                    }
            }
        }
        return true;
    }
}