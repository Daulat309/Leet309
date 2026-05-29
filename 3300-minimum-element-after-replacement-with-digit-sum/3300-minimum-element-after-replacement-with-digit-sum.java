class Solution {
    public int minElement(int[] n) {
        int mn = Integer.MAX_VALUE;
        for(int i = 0;i<n.length;i++){
            int k = n[i];
            int s = 0;
            while(k!=0){
                s += k%10;
                k /= 10;
            }
            mn = Math.min(mn,s);
        }
        return mn;
    }
}