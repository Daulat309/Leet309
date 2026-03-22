class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        int odd = 0;
        for(int i = 0;i<nums1.length;i++){
            if((nums1[i] & 1)==1) odd++;
            min = Math.min(nums1[i],min);
        }
        if((min&1)==1||odd==0) return true;
        return false;
    }
}