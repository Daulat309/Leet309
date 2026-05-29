class Solution {
    public int minimumSwaps(int[] n) {
        int l = 0, h = n.length-1,cnt=0;
        while(l<h){
            if(n[h]==0){
                h--;
            }
            else if(n[l]==0){
                n[l] = n[h];
                n[h] = 0;
                h--;
                cnt++;
            }
            else l++;
        }
        return cnt;
    }
}