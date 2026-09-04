class Solution { 
    HashMap<Integer, int[]> mp = new HashMap<>(); 

    public TreeNode createBinaryTree(int[][] d) { 
        
        HashSet<Integer> set = new HashSet<>(); 

        for (int[] a : d) { 
            set.add(a[1]); 

            mp.putIfAbsent(a[0], new int[2]); 

            if (a[2] == 1) {
                mp.get(a[0])[0] = a[1]; 
            } else {
                mp.get(a[0])[1] = a[1]; 
            }
        } 

        int rt = 0; 

        for (int[] a : d) { 
            if (!set.contains(a[0])) { 
                rt = a[0]; 
                break; 
            } 
        } 

        TreeNode root = new TreeNode(rt); 
        make(root); 

        return root; 
    } 

    public void make(TreeNode root) { 
        int rt = root.val; 

        if (mp.containsKey(rt)) { 

            if (mp.get(rt)[0] != 0) { 
                TreeNode lft = new TreeNode(mp.get(rt)[0]); 
                root.left = lft; 
                make(lft); 
            } 

            if (mp.get(rt)[1] != 0) { 
                TreeNode rht = new TreeNode(mp.get(rt)[1]); 
                root.right = rht; 
                make(rht); 
            } 
        } 
    } 
}