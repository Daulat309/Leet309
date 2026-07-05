class Solution {
    public int kthSmallest(int[][] a, int k) {
        int l = a[0][0], h = a[a.length-1][a[0].length-1];
        while(l<h){
            int m = l + (h-l)/2;
            int c = lesst(a,m);
            System.out.println(m+"  "+c);
            if(c>=k){
                h = m;
            }
            else l = m + 1;
        }
        return l;
    }


    public int lesst(int[][] a, int n){
        int r = 0, c = a[0].length-1;
        int cnt = 0;
        while(r<a.length&&c>=0){
            if(a[r][c]<=n){
                cnt += c + 1;
                r++;
            }
            else c--;
        }
        System.out.println(cnt);
        return cnt;
    }
}