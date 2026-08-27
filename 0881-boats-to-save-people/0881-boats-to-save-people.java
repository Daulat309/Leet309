class Solution {
    public int numRescueBoats(int[] a, int x) {
        Arrays.sort(a);
        int n = a.length;
        int l = 0, h = a.length-1;
        int cnt = 0;
        while(l<=h){
            if(a[l]+a[h]<=x){
                l++;
            }
            h--;
            cnt++;
        }
        return cnt;
    }
}