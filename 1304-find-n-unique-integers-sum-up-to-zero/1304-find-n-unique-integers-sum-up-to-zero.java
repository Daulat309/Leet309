class Solution {
    public int[] sumZero(int n) {
        int[] a = new int[n];
        int l = 0, h = n-1;
        while(l<=h){
            a[l] = l - h;
            a[h] = h - l;
            l++;
            h--;
        }
        return a;
    }
}