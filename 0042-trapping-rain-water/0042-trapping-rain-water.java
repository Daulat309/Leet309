class Solution {
    public int trap(int[] hgt) {
        int lmx = 0, rmx = 0;
        int l = 0, r = hgt.length-1, wtr = 0;

        while(l<=r){
            if(hgt[l]<=hgt[r]){
                if(lmx<=hgt[l]){
                    lmx = hgt[l];
                }
                else{
                    wtr += lmx - hgt[l];
                }
                l++;
            }
            else{
                if(rmx<=hgt[r]){
                    rmx = hgt[r];
                }
                else{
                    wtr += rmx - hgt[r];
                }
                r--;
            }
        }
        return wtr;
    }
}