class Solution {
    public int maxDistance(int[] a, int[] b) {
        int mx = 0, r = 0;
        for(int i = 0;i<a.length;i++){
            int x = a[i], s =i,e=b.length;
            r = Math.max(bS(b,a[i],i,b.length-1)-i,r);
        }
        return r;
    }

    public int bS(int[] a,int x, int s, int e){
        int l = s, h = e,lb=0;
        while(l<=h){
            int m = l + (h-l)/2;
            if(a[m]>=x){
                lb = m;
                l = m +1;
            }
            else h = m -1;
        }
        return lb;
    }
}