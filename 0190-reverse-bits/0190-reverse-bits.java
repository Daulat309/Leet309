class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0;i<31;i++){
            int k = n&1;
            int l = k<<(31-i);
            n = n>>1;
            res = res | l;
        }
        return res;
    }
}