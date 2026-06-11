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
    public boolean isSameTree(TreeNode P, TreeNode Q) {
        Queue<TreeNode> p = new ArrayDeque<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        if(P==null&&Q==null) return true;
        if(P==null||Q==null) return false;
        if(P.val!=Q.val) return false;
        p.offer(P);
        q.offer(Q);

        while(!p.isEmpty()&&!q.isEmpty()){
            int m = p.size();
            int n = q.size();
            if(m!=n) return false;
            while(m-->0&&n-->0){
                TreeNode a = p.poll();
                TreeNode b = q.poll();
                if(a.left!=null){
                    if(b.left!=null){
                        if(a.left.val!=b.left.val) {
                            return false;
                        }
                        p.offer(a.left);
                        q.offer(b.left);
                    }
                    else return false;
                }
                else if(b.left!=null){
                    if(a.left!=null){
                        if(a.left.val!=b.left.val) return false;
                    }
                    else return false;
                }
                if(a.right!=null){
                    if(b.right!=null){
                        if(a.right.val!=b.right.val) return false;
                        p.offer(a.right);
                        q.offer(b.right);
                    }
                    else return false;
                }
                else if(b.right!=null){
                    if(a.right!=null){
                        if(a.right.val!=b.right.val) return false;
                    }
                    else return false;
                }
            }
            
        }
        return true;
    }
}