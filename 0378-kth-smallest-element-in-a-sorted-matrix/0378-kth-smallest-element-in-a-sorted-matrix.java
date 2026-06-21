class Solution {
    
    public int kthSmallest(int[][] a, int d) {
        int l = a[0][0], h = a[a.length-1][a[0].length-1];
        while(l<h){
            int m = l + (h-l)/2;
            int c = nele(a,m);
            System.out.println(m+"  "+c);
            if(c>=d){
                h = m;
            }
            else l = m + 1;
        }
        return l;
    }

    public int nele(int[][] a, int x){
        int cnt = 0;
        int r = 0;
        int c = a[0].length-1;
        while(r<a.length&&c>=0){
            if(a[r][c]<=x){
                if(cnt==0){
                    cnt = (c+1)*(r+1);
                }
                else cnt += c+1;
                r++;
            }
            else c--;
        }
        return cnt;
    }
}