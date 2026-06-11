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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root==null) return 0;
        q.offer(root);
        int cnt = 1;
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                TreeNode node = q.poll();
                if(node.left==null&&node.right==null) return cnt;
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            cnt++;
        }
        return cnt;
    }
}