class Solution {
    public int sumFourDivisors(int[] nums) {
        boolean isit = false;
        int finsum = 0;
        for(int i = 0;i<nums.length;i++){
            int sum = nums[i]+1;
            int count = 2;
            for(int j = 2;j<=nums[i]/2;j++){
                if(nums[i]%j==0){
                   count++;
                   sum += j;
                }
                if(count>4) break;
            }
            if(count==4){
                finsum += sum;
                isit = true;
            }
        }
        if(isit) return finsum;
        return 0;
    }
}