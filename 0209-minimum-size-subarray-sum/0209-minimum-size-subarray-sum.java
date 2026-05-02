class Solution {
    public int minSubArrayLen(int x, int[] n) {
        int mnc = 1000000;
        int l = 0, h = 0;
        int s = 0;

        while(l<n.length){
            if(h==n.length){
                l++;
                h = l;
                s = 0;
            }
            else{
            s += n[h];
            if(s>=x){
                mnc = Math.min(h-l+1,mnc);
                l++;
                h = l;
                s = 0;
            }
            else h++;
            }
        }




        // for(int i = 0;i<n.length;i++){
        //     int s = 0;
        //     int l = i;
        //     while(l<n.length){
        //         s += n[l];
        //         if(s>=x){
        //             mnc = Math.min((l-i+1),mnc);
        //             break;
        //         }
        //         l++;
        //     }
        // }
        return mnc==1000000?0:mnc;
    }
}