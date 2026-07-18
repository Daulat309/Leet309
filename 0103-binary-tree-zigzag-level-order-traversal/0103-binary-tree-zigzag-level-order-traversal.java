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
        List<List<Integer>> list = new LinkedList<>();
        if(root==null) return list;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean turn = false;
        while(!q.isEmpty()){
            int l = q.size();
            LinkedList<Integer> ls = new LinkedList<>();
            while(l-->0){
                TreeNode node = q.poll();
                if(turn) ls.addFirst(node.val);
                else ls.addLast(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            list.add(ls);
            turn = !turn;
        }
        return list;
    }
}