class Solution {
    public int maxSubArray(int[] n) {
        int s = n[0];
        int r = n[0];
        for(int i = 1;i<n.length;i++){
            if(s<0) s = n[i];
            else s += n[i];
            r = Math.max(s,r);
        }
        return r;
    }
}