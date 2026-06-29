class Solution {
    public int findDuplicate(int[] nums) {
        int sl = 0, fs = 0;
        do{
            fs = nums[fs];
            fs = nums[fs];
            sl = nums[sl];
        }while(sl!=fs);
        System.out.println(sl);
        sl = 0;
        while(nums[fs]!=nums[sl]){
            fs = nums[fs];
            sl = nums[sl];
        }
        return nums[sl];
    }
}