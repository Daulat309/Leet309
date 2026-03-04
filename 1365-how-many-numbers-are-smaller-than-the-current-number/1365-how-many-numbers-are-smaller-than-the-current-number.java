class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ar = new int[nums.length];
        for(int i = 0;i<nums.length;i++) ar[i] = nums[i];
        Arrays.sort(ar);
        for(int i = 0;i<nums.length;i++){
            nums[i] = lb(ar,nums[i]);
        }
        return nums;
    }

    public int lb(int[] ar, int n){
    int l = 0, h = ar.length - 1;

    while(l <= h){
        int mid = l + (h - l) / 2;

        if(ar[mid] < n) 
            l = mid + 1;
        else 
            h = mid - 1;
    }

    return l;
    }
}