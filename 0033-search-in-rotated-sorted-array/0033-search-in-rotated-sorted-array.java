class Solution {
    public static int spos(int[] ar){
        int i;
        for(i = ar.length-1;i>0;i--){
            if(ar[i]<ar[i-1]) break;
        }
        return i;
    }

    public static int bs(int[] ar,int l, int h, int x){
        while(l<=h){
            int mid = l + (h-l)/2;
            if(ar[mid]==x) return mid;
            if(ar[mid]>x) h = mid-1;
            else l = mid+1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int s = spos(nums);
        if(nums[s]==target) return s;
        if(nums[nums.length-1]>=target) return bs(nums,s,nums.length-1,target);
        else return bs(nums,0,s-1,target);
    }
}