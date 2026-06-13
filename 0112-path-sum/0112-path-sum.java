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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int[] is = new int[3];
        check(root, targetSum, is);
        return is[1]==1;
    }

    public void check(TreeNode root, int x, int[] is){
        if(root==null) return;
        is[0] += root.val;
        is[2] = root.val;
        if(root.left==null&&root.right==null){
            if(is[0]==x) is[1] = 1;
        }
        check(root.left, x, is);
        check(root.right, x, is);
        System.out.println(is[2]);
        is[0] -= root.val;
    }
}