class Solution {
    public int minCostToMoveChips(int[] p) {
        if(p.length==1) return 0;
        int e = 0, o = 0;
        for(int i = 0;i<p.length;i++){
            if((p[i]&1)==1) o++;
            else e++;
        }
        System.out.println(e+" "+o);
        return e>o?o:e;
    }
}