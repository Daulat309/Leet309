class Solution {
    public int countHillValley(int[] a) {
        int cnt = 0;
        int l = 0,k = l + 1, h = l + 2;
        while(h<a.length){
            if(a[l]>a[k]&&a[k]<a[h]||a[l]<a[k]&&a[k]>a[h]){
                cnt++;
                k = h;
                h++;
                l = k-1;
            }
            else if(a[k]==a[h]) h++;
            else {
                l = k;
                k = h;
            }
        }
        return cnt;
    }
}