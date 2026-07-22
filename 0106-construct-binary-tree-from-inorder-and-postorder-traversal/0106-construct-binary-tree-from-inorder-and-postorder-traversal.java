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
    HashMap<Integer, Integer> mp = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = inorder.length-1;
        
        for(int i = 0;i<inorder.length;i++) mp.put(inorder[i], i);
        return build(postorder, 0, inorder.length-1);
    }

    public TreeNode build(int[] p, int l, int h){
        if(l>h) return null;
        TreeNode node = new TreeNode(p[idx]);
        idx--;
        int id = mp.get(node.val);
        node.right = build(p, id+1,h);
        node.left = build(p, l, id - 1);

        return node;
    }
}