class Solution {
    public int maxArea(int[] h) {
        int max = 0, d = 0, r = h.length -1;
        while(d<r){
            int a = (r-d)*Math.min(h[d],h[r]);
            if(a>max) max = a;
            if(h[d]>h[r]) r--;
            else d++;
        }
        return max;
    }
}