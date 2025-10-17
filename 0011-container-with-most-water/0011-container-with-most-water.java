class Solution {
    public int maxArea(int[] h) {
        int max = 0;
        int l = h.length;
        int d = 0;
        int r = l-1;
        while(d<r){
            int a = (r-d)*Math.min(h[d],h[r]);
            if(a>max) max = a;
            if(h[d]>h[r]) r--;
            else d++;
        }
        // for(int i = 0;i<l;i++){
        //     int a = (r-d)*Math.min(h[d],h[r]);
        //     if(a>max) a = max;
        //     if(h[d]>h[r]) r--;
        //     else d++;
        // }
        return max;
    }
}