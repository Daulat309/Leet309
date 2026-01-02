class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length/2;
        int past = nums[0];
        int count = 1;
        for(int i = 1; i<nums.length;i++){
            int k = nums[i];
            if(k!=past){
                count = 1;
                past = k;
            }
            else{
                count++;
                if(n==count) return k;
            }
        }
        return nums[nums.length-1];
    }
}