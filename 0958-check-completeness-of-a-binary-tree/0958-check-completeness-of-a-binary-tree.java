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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root==null) return true;
        q.offer(root);
        return isc(q);
    }

    public boolean isc(Queue<TreeNode> q) {
        while(!q.isEmpty()){
            int l = q.size();
            while(l-->0){
                TreeNode tn = q.poll();
                if(tn.left!=null){
                    if(!is) return false;
                    q.offer(tn.left);
                }
                else is = false;
                if(tn.right!=null){
                    if(!is) return false;
                    q.offer(tn.right);
                }
                else is = false;

            }
        }
        return true;
    }
}