class Solution {
    public int fib(int n) {
        int[] a = new int[n+1];
        Arrays.fill(a,-1);
        return fibo(a,n);
    }

    public int fibo(int[] a, int n) {
        if(a[n]!=-1) return a[n];
        if(n<=1){
            a[n] = n;
            return a[n];
        }
        a[n] = fibo(a,n-1)+fibo(a,n-2);
        return a[n];
    }
}