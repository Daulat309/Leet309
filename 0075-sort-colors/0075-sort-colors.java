class Solution {
    public void sortColors(int[] n) {
        if(n.length<2) return;
        int l = 0, md = 0,h = n.length-1;
        while(md<=h){
            if(n[md]==0){
                int t = n[l];
                n[l] = n[md];
                n[md] = t;
                l++;
                md++;
            }
            else if(n[md]==1) md++;
            else{
                int t = n[h];
                n[h] = n[md];
                n[md] = t;
                h--;
            }
        }
    }
}