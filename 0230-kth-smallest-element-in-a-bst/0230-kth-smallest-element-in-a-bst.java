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
    public int kthSmallest(TreeNode root, int k) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        kth(root,k,st,list);
        return list.get(list.size()-k);
    }

    public void kth(TreeNode root, int k, Stack<Integer> st, List<Integer> list){
        if(root==null) return;
        st.push(root.val);
        kth(root.right,k,st,list);
        list.add(st.pop());
        kth(root.left,k,st,list);
       
    }
}