class Solution {
    public int totalFruit(int[] fruits) {
        int first = -1, sec = -1, l = 0, mxl = 0, fsc = 0, secc = 0;
        for(int r = 0;r<fruits.length;r++){
            int f = fruits[r];
            if(f==first){
                fsc++;
            }

            else if(f==sec) secc++;

            else{
                while(fsc>0&&secc>0){
                    if(fruits[l]==first) fsc--;
                    else secc--;
                    l++;
                }
                if(fsc==0){
                    first = f;
                    fsc++;
                }
                else{
                    sec = f;
                    secc++;
                }
            }
            mxl = Math.max(mxl, r - l + 1);
        }
        return mxl;
    }
}