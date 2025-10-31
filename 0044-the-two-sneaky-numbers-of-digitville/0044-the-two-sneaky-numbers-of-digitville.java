class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        // boolean[] a = new boolean[n];
        int[] ar = new int[2];
        int k = 0;
        Arrays.sort(nums);
        for(int i = 1;i<n;i++) if(nums[i-1]==nums[i]) ar[k++] = nums[i];
        // {
        //     if(a[nums[i]]==true) ar[k++] = nums[i];
        //     else a[nums[i]] = true;
        // }
        // if(ar[0]>ar[1]){
        //     k = ar[0]; ar[0] = ar[1]; ar[1] = k;
        // }
        return ar;
    }
}