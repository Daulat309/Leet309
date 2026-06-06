class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int[] a = new int[n];
        Arrays.fill(a,1);
        while(k-->0){
            for(int i = 1;i<n;i++){
                long l = (a[i-1]+a[i])%1000000007;
                a[i] = (int)l;
            }
        }
        return a[n-1];
    }
}