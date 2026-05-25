class Solution {
    public int[][] intervalIntersection(int[][] fl, int[][] sl) {
        int in1 = 0, in2 = 0;
        ArrayList<int[]> list = new ArrayList<>();
        if(fl.length==0||sl.length==0) return new int[][]{};
        while(in1<fl.length&&in2<sl.length){
            int s1 = fl[in1][0], e1 = fl[in1][1];
            int s2 = sl[in2][0], e2 = sl[in2][1];
            int s = Math.max(s1,s2), e = Math.min(e1,e2);
            if(s<=e) list.add(new int[]{s,e});
            if(e1<e2){
                in1++;
            }
            else{
                in2++;
            }
        }

        int[][] r = new int[list.size()][2];
        for(int i = 0;i<list.size();i++){
            int[] a = list.get(i);
            r[i][0] = a[0];
            r[i][1] = a[1];
        }
        return r;
    }
}