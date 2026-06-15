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
    public TreeNode sortedArrayToBST(int[] n) {
        return make(n,0,n.length-1);
    }

    public TreeNode make(int[] n,int l, int h){
        if(l>h) return null;
        int m = (l+h)/2;
        TreeNode node = new TreeNode(n[m]);
        node.left = make(n,l,m-1);
        node.right= make(n,m+1,h);
        return node;
    }
}