class Solution {
    public int sumOfSquares(int[] nums) {
        long res = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(n%(i+1)==0) res += nums[i]*nums[i];
        }
        return (int)res;
    }
}