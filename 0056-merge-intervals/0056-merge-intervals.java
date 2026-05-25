class Solution {
    public int[][] merge(int[][] in) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(in,(a,b)->a[0]-b[0]);
        int s1 = in[0][0];
        int e1 = in[0][1];
        for(int i = 1;i<in.length;i++){
            if(e1>=in[i][0]){
                e1 = Math.max(e1,in[i][1]);
            }
            else{
                list.add(new int[]{s1,e1});
                s1 = in[i][0];
                e1 = in[i][1];
            }
        }
        list.add(new int[]{s1,e1});
        int[][] res = new int[list.size()][2];
        for(int i = 0;i<list.size();i++){
            int[] a = list.get(i);
            res[i][0] = a[0];
            res[i][1] = a[1];
        }
        return res;
    }
}