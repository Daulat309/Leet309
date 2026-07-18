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
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean turn = false;
        while(!q.isEmpty()){
            int l = q.size();
            List<Integer> ls = new ArrayList<>();
            while(l-->0){
                TreeNode node = q.poll();
                ls.add(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            if(turn) Collections.reverse(ls);
            list.add(ls);
            turn = !turn;
        }
        return list;
    }
}