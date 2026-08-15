class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] a = new int[2];
        for(int i : bills){
            if(i==20){
                if((a[0]>0&&a[1]>0)||a[1]>2){
                    if(a[0]>0&&a[1]>0){
                        a[0]--;
                        a[1]--;
                    }
                    else a[1] -= 3;
                }
                else return false;
            }
            else if(i==10){
                if(a[1]>0){
                    a[1]--;
                    a[0]++;
                }
                else return false;
            }
            else a[1]++;
        }
        return true;
    }
}