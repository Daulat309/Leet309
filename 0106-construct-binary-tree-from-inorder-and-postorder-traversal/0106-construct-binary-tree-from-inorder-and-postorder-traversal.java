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
    int idx;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] in, int[] post) {
        idx = post.length-1;
        for(int i = 0;i<in.length;i++) map.put(in[i],i);
        return make(post,0,in.length-1);
    }

    public TreeNode make(int[] post, int l, int h){
        if(l>h) return null;
        TreeNode node = new TreeNode(post[idx]);
        idx--;
        int id = map.get(node.val);
        node.right = make(post,id+1,h);
        node.left = make(post,l,id-1);
        
        return node;
    }
}