class Solution {
    public int totalFruit(int[] fruits) {
        int cnt = 1, l = 0, h = 1, mx = 1,a = -1, b = fruits[l];
        while(h<fruits.length){
            int k = fruits[h];
            if(k==b){
                cnt++;
            }
            else{
                if(k==a){
                    l = h;
                    cnt++;
                    a = b;
                    b = k;
                }
                else{
                    if(a==-1){
                        a = b;
                        b = k;
                        l = h;
                        cnt++;
                    }
                    else{
                        cnt = h - l + 1;
                        a = b;
                        b = k;
                        l = h;
                    }
                }
            }
            mx = Math.max(mx,cnt);
            h++;
        }
        return mx;
    }
}