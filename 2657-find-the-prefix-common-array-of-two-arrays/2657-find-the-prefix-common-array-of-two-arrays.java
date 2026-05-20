class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] a = new int[A.length+1];
        Arrays.fill(a,-2);
        int[] x = new int[A.length];
        int cnt = 0;
        for(int i = 0;i<A.length;i++){
            a[A[i]]++;
            a[B[i]]++;
            if(A[i]==B[i]){
                ++cnt;
            }
            else {
                if(a[A[i]]==0) ++cnt;
                if(a[B[i]]==0) ++cnt;
            }
            x[i] = cnt;
        }
        return x;
    }
}