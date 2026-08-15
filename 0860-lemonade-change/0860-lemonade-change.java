class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0, t = 0;
        for(int i : bills){
            if(i==20){
                if(t>0&&f>0||f>2){
                    if(t>0&&f>0){
                        t--;
                        f--;
                    }
                    else f -= 3;
                }
                else return false;
            }
            else if(i==10){
                if(f>0){
                    f--;
                    t++;
                }
                else return false;
            }
            else f++;
        }
        return true;
    }
}