class Solution {
    public int findDuplicate(int[] nums) {
        int[] a = new int[nums.length];
        for(int i : nums){
            a[i]++;
            if(a[i]>1) return i;
        }
        return 0;
    }
}