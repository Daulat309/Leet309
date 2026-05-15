class Solution {
    public int findMin(int[] nums) {
        int i = (pk(nums) + 1 )%nums.length;
        return nums[i];
    }


    public int pk(int[] a){
        int l = 0, h = a.length-1;
        while(l<h){
            int m = l + (h-l)/2;
            if(a[m]>a[h]) l = m+1;
            else h = m;
        }
        return (l - 1 + a.length)%a.length;
    }
}