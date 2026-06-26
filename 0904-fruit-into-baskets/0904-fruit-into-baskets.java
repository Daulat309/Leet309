class Solution {
    public int totalFruit(int[] f) {
        int t1 = f[0], t2 = -1,cnt = 0, mx = 0;
        int past = 0;
        int h = 0;
        while(h<f.length){
            if(f[h]==t1||f[h]==t2){
                cnt++;
                if(f[h]!=f[past]) past = h;
            }
            else{
                if(t2==-1){
                    t2 = f[h];
                    cnt++;
                    past = h;
                }
                else{
                    t1 = f[past];
                    t2 = f[h];
                    cnt = h - past + 1;
                    past = h;
                }
            }
            mx = Math.max(cnt, mx);
            h++;
        }
        return mx;
    }
}