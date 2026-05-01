class Solution {
    public int removeDuplicates(int[] n) {
        int cnt = 0;
        for(int i = 1;i<n.length;i++){
            if(n[cnt]!=n[i]){
                n[++cnt] = n[i];
            }
        }
        return cnt+1;
    }
}