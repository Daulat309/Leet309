class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int req = k*1;
        int nz = 1;
        for(int n : nums){
            if(n>req) break;
            else if(n==req){
                nz++;
                req = nz*k;
            }
        }
        return req;
    }
}