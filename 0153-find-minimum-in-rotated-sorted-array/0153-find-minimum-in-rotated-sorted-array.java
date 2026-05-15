class Solution {
    public int findMin(int[] nums) {
        int i = (pk(nums) + 1 )%nums.length;
        return nums[i];
    }


    public int pk(int[] a){
        int l = 0, h = a.length-1;
        while(l<h){
            int m = l + (h-l)/2;
            if(m<h&&a[m]>a[m+1]) return m;
            if(m>l&&a[m]<a[m-1]) return m-1;

            if(a[l]<=a[m]) l = m+1;
            else h = m-1;
        }
        return l;
    }
}