class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode head;
        List<Integer> list = new ArrayList<>();
        for(int i : nums) list.add(i);
        head = binarySearchTree(list);
        return head;
    }

    TreeNode binarySearchTree(List<Integer> val) {
        if(val.size() == 0) return null;
        int maximun = (int)(val.size()/2);
        TreeNode head = new TreeNode();
        head.left = binarySearchTree(val.subList(0,maximun));
        head.val = val.get(maximun);
        head.right = binarySearchTree(val.subList(maximun+1,val.size()));
        return head;
    }
}