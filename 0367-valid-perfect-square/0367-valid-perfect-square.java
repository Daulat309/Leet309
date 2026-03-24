class Solution {
    public boolean isPerfectSquare(int x) {
        if(x==0) return true;
        int l = 1, h = x/2+1, r = 0;
        while(l<=h){
            int m = l + (h-l)/2;
            if(m*m==x) return true;
            if(m<x/m) l = m + 1;
            else h = m-1;
        }
        return false;
    }
}