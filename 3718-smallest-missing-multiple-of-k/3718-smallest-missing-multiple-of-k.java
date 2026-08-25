class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int n = k;
        for(int i : nums){
            if(i==k){
                k += n;
            }
            else if(i>k) return k;
        }
        return k;
    }
}