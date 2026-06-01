class Solution {
    public int fib(int n) {
        int[] a = new int[n+1];
        //Arrays.fill(a,-1);
        return fibo(a,n);
    }

    public int fibo(int[] a, int n) {
        if(n<=1) return n;
        if(a[n]!=0) return a[n];
        return a[n] = fibo(a,n - 1) + fibo(a,n - 2);
    }
}