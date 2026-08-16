class Solution {
    public int nearestDrone(int[][] d, int[] t) {
        int ind  = -1, ls = -1;
        for(int i = 0;i<d.length;i++){
            int[] a = d[i];
            int ds = Math.abs(t[0]-a[0])+Math.abs(t[1]-a[1]);
            if(ds<=a[2]){
                if(ind==-1){
                    ind = i;
                    ls = ds;
                }
                else if(ds<ls){
                    ind  = i;
                    ls = ds;
                }
            }
        }
        return ind;
    }
}