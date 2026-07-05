class Solution {
    public int splitArray(int[] nums, int k) {
        long l = Integer.MAX_VALUE, h = 0;
        for(int i : nums){
            l = Math.min(l,i);
            h += i;
        }
        while(l<=h){
            long m = l + (h-l)/2;
            if(isp(nums,m,k)){
                h = m - 1;
            }
            else l = m + 1;
        }
        return (int)l;

    }

    public boolean isp(int[] a, long c, int k){
        long s = 0;
        int cnt = 0;
        for(int i = 0;i<a.length;i++){
            if(s+a[i]>c){
                cnt++;
                s = a[i];
            }
            else s += a[i];
            if(s>c) return false;
        }
        if(s!=0) cnt++;
        return cnt<=k;
    }
}