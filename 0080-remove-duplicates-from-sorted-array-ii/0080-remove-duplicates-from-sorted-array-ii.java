class Solution {
    public int removeDuplicates(int[] n) {
        int cnt = 0;
        int k = 1;
        for(int i = 1;i<n.length;i++){
            if(n[cnt]!=n[i]){
                cnt++;
                n[cnt] = n[i];
                k = 1;
            }
            else {
                if(k<2){
                cnt++;
                n[cnt] = n[i];
                }
                k++;
            }
        }
        return cnt+1;
    }
}