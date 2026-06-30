class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        for(int i = 0;i<=n;i++){
            int s = 0;
            int k = i;
            while(k!=0){
                k = k & (k-1);
                s++;
            }
            a[i] = s;
        }
        return a;
    }
}