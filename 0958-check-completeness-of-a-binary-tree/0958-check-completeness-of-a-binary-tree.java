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
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return true;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode tn = q.peek();
            q.poll();
            if(tn==null) is = false;
            else{
                if(!is) return false;
                q.offer(tn.left);
                q.offer(tn.right);
            }
            //int l = q.size();
            // while(l-->0){
            //     TreeNode tn = q.poll();
            //     if(tn.left!=null){
            //         if(!is) return false;
            //         q.offer(tn.left);
            //     }
            //     else is = false;
            //     if(tn.right!=null){
            //         if(!is) return false;
            //         q.offer(tn.right);
            //     }
            //     else is = false;
            // }
        }
        return true;
    }
}