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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root==null) return list;
        q.offer(root);
        while(!q.isEmpty()){
            int l = q.size();
            List<Integer> ls = new ArrayList<>();
            while(l-->0){
                TreeNode p = q.poll();
                ls.add(p.val);
                if(p.left!=null) q.offer(p.left);
                if(p.right!=null) q.offer(p.right);
            }
            list.add(ls);
        }
        Collections.reverse(list);
        return list;
    }
}