class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ar = new int[nums.length];
        int size = 0;
        for(int i = 0;i<nums.length;i++){
            size = insertAtIndex(ar, nums[i], index[i], size);
        }
        return ar;
    }

    public int insertAtIndex(int[] ar, int x, int ind, int size){
        for(int i = size;i>ind;i--) ar[i] = ar[i-1];
        ar[ind] = x;
        size++;
        return size;
    }
}