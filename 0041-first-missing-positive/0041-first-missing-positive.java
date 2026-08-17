class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int r = 1;
        for(int i : nums){
            if(i>0){
                if(i!=r&&i>r){
                    return r;
                }
                if(i==r)r++;
            }
        }
        return r;
    }
}