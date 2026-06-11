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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        boolean turn = false;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int s = q.size();
            while(s-->0){
                TreeNode node = q.poll();
                if(turn)l.add(0,node.val);
                else l.add(node.val);
                //if(turn) { 
                    if(node.left!=null) q.offer(node.left);
                    if(node.right!=null) q.offer(node.right);
                    //turn = false;
                //}
                // else {
                //     if(node.right!=null) q.offer(node.right);
                //     if(node.left!=null) q.offer(node.left);
                //     //turn = true;
                // }
            }
            list.add(l);
            turn = turn==true ? false:true;
        }
        return list;
    }
}