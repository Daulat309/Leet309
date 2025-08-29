class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        if(n==1&&nums[0]!=0) return 1;
        boolean[] ar = new boolean[101];
        int[] arr = new int[101];
        int k = 0;
        for(int i = 0;i<n;i++){
            if (ar[nums[i]] == false && ar[i] != 0){
                arr[k++] = nums[i];
                ar[nums[i]] = true;
            }
        }
        return k;
    }
}