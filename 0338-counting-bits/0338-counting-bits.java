class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        for(int i = 0;i<=n;i++){
            int k = i;
            int s = 0;
            while(k!=0){
                s += k&1;
                k >>= 1;
            }
            a[i] = s;
        }
        return a;
    }
}