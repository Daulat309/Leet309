class Solution {
    public int countMajoritySubarrays(int[] a, int x) {
        int cnt = 0;
        int res = 0;
        int h = 0;
        while(h<a.length){
            if(a[h]==x) cnt ++;
            int crl = 0;
            float crcnt = (float)cnt;
            while(crl<=h){
                float l = (h - crl + 1)/2.0f;
                if(crcnt>l) res++;
                if(a[crl]==x) crcnt--;
                crl++;
            }
            h++;
        }
        return res;
    }
}