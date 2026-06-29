class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, h = 0, favour = 0, mx = 0;
        while(h<nums.length){
            if(nums[h]==1) favour++;
            int rq = h-l+1 - favour;
            while(rq>k){
                if(nums[l]==1) favour--;
                l++;
                rq = h-l+1-favour;
            }
            mx = Math.max(mx,h-l+1);
            h++;
        }
        return mx;
    }
}