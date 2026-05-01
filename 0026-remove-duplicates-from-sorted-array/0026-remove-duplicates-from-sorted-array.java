class Solution {
    public int removeDuplicates(int[] n) {
        int cnt = 1;
        for(int i = 1;i<n.length;i++){
            if(n[i]!=n[i-1]){
                n[cnt++] = n[i];
            }
        }
        return cnt;
    }
}