class Solution {
    public int maxSum(int[] nums) {
        int f = 0;
        if(nums.length==1)
            return nums[0];
        int[] freq = new int[101];
        int sum = 0;
        for(int digit:nums){
            if(digit>=0){
            freq[digit]++;
            f = 1;    
            }    
        }
        for(int i = 0;i<101;i++){
            if(freq[i]>0)
                sum += i;
        }
        if(f==0){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        return sum;
    }
}