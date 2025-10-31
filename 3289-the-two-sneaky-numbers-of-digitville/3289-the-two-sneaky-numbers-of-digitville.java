class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        boolean[] a = new boolean[n];
        int[] ar = new int[2];
        int k = 0;
        for(int i = 0;i<n;i++){
            if(a[nums[i]]==true) ar[k++] = nums[i];
            else a[nums[i]] = true;
        }
        if(ar[0]>ar[1]){
            int temp = ar[0]; ar[0] = ar[1]; ar[1] = temp;
        }
        return ar;
    }
}