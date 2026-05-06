class Solution {
    public int findDuplicate(int[] nums) {
        int sl = 0, fs = 0;
        while(true){
            sl = nums[sl];
            fs = nums[fs];
            fs = nums[fs];
            if(sl==fs){
                sl = 0;
                while(sl != fs){
                    sl = nums[sl];
                    fs = nums[fs];
                }
                return sl;
            }
        }
    }
}