class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ar = new int[n*2];
        int k = 0;
        for(int i = 0;i<2*n-1;i += 2){
            ar[i] = nums[k];
            ar[i+1] = nums[k+n];
            k++;
        }
        return ar;
    }
}