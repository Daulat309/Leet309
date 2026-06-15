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
    int idx = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] pre, int[] in) {
        for(int i = 0;i<in.length;i++) map.put(in[i],i);
        return make(pre,0,in.length-1);
    }

    public TreeNode make(int[] pre, int l, int h){
        if(l>h) return null;
        TreeNode node = new TreeNode(pre[idx]);
        idx++;
        int id = map.get(node.val);
        node.left = make(pre,l,id-1);
        node.right = make(pre,id+1,h);
        return node;
    }
}