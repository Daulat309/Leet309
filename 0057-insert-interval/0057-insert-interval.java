class Solution {
    public int[][] insert(int[][] in, int[] nin) {
        ArrayList<int[]> list = new ArrayList<>();
        if(in.length==0) list.add(nin);
        boolean ins = true;
        for(int i = 0;i<in.length;i++){
            if(ins&&in[i][0]>=nin[0]){
                list.add(nin);
                ins = false;
            }
            list.add(in[i]);
        }
        if(ins) list.add(nin);
        return merge(list);
    }

    public int[][] merge(ArrayList<int[]> list){
        ArrayList<int[]> list1 = new ArrayList<>();
        int s = list.get(0)[0], e = list.get(0)[1];
        for(int i = 1;i<list.size();i++){
            if(e>=list.get(i)[0]){
                e = Math.max(e, list.get(i)[1]);
            }
            else{
                list1.add(new int[]{s,e});
                s = list.get(i)[0];
                e = list.get(i)[1];
            }
        }
        list1.add(new int[]{s,e});
        int[][] r = new int[list1.size()][2];
        for(int i = 0;i<list1.size();i++){
            int[] a = list1.get(i);
            r[i][0] = a[0];
            r[i][1] = a[1];
        }
        return r;
    }
}