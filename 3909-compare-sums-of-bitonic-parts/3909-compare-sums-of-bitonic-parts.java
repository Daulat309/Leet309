class Solution {
    public int compareBitonicSums(int[] nums) {
        int pk = peak(nums);
        long l = 0, r = 0;
        for(int i = 0;i<=pk;i++) l += nums[i];
        for(int i = pk;i<nums.length;i++) r += nums[i];
        //System.out.println(l +"  " + pk +"  " + r);
        return l>r?0:l==r?-1:1;
    }
    public static int peak(int[] a){
        int l = 0, h = a.length-1;
        while(l<h){
            int m = l + (h-l)/2;
            if(a[m]<a[m+1]) l = m+1;
            else h = m;
        }
        return l;
    }
}