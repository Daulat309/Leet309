class Solution {
    public int longestOnes(int[] s, int k) {
        int one = 0, zero = 0, z = 0;
        for(int i  : s) if(i==0) z++;
        k = Math.min(z,k);
        int l = 0, h = 0, mxl = 0;
        while(h<s.length){
            if(s[h] == 0) zero++;
            else one++;
            int len = h - l + 1;
            int diff = len - one;
            while(diff>k&&l<=h){
                if(s[l] == 0) zero--;
                else one--;
                l++;
                len = h - l + 1;
                diff = len - one;
            }
            mxl = Math.max(h-l+1,mxl);
            h++;
        }
        return mxl;
    }
}