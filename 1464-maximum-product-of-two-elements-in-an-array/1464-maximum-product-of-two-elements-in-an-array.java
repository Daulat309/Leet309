class Solution {
    public int maxProduct(int[] nums) {
        int mn1 = Integer.MAX_VALUE, mn2 = Integer.MAX_VALUE;
        int mx1 = Integer.MIN_VALUE, mx2 = Integer.MIN_VALUE;
        for(int i : nums){
            if(i > mx1){
                mx2 = mx1;
                mx1 = i;
            }
            else if(i>mx2){
                mx2 = i;
            }
            if(i < mn1){
                mn2 = mn1;
                mn1 = i;
            }
            else if(i<mn2){
                mn2 = i;
            }
        }
        int r1 = (mx1-1)*(mx2-1), r2 = (mn1-1)*(mn2-1);
        return r1>r2?r1:r2;
    }
}