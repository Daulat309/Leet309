class Solution {
    public int maxArea(int[] ht) {
        int l = 0, h = ht.length-1;
        int mx = Integer.MIN_VALUE;
        while(l<=h){
            int x = (h-l)*Math.min(ht[l],ht[h]);
            mx = Math.max(mx,x);
            if(ht[l]>=ht[h]){
                h--;
            }
            else l++;
        }
        return mx;
    }
}