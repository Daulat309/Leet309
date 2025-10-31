class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        boolean[] a = new boolean[n];
        int[] ar = new int[2];
        int k = 0;
        for(int i = 0;i<n;i++){
            if(a[nums[i]]){
                ar[k++] = nums[i];
                if(k==2) break;
            }    
            else a[nums[i]] = true;
        }
        return ar;
    }
}