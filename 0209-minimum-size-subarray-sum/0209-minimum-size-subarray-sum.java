class Solution {
    public int minSubArrayLen(int x, int[] n) {
        int l = 0, h = 0, s = 0, mnl = 1000000;
        while(h<n.length){
            s += n[h];
            if(s>=x) mnl = Math.min(mnl, h-l+1);
            while(s>x&&l<=h){
                s -= n[l];
                l++;
                if(s>=x) mnl = Math.min(mnl, h-l+1);
            }
            h++;
        }
        return mnl==1000000?0:mnl;
    }
}