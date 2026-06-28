class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] o, int fs, int fe) {
        Arrays.sort(o,(a,b)->a[0]-b[0]);
        int s = o[0][0];
        int e = o[0][1];
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1;i<o.length;i++){
            if(o[i][0]<=e+1) e = Math.max(o[i][1],e);
            else{
                if(e<fs||s>fe){
                list.add(Arrays.asList(s,e));
            }
            else{
                if(s<fs){
                    list.add(Arrays.asList(s,fs-1));
                }
                if(e>fe){
                    list.add(Arrays.asList(fe+1,e));
                }
            }
                s = o[i][0];
                e = o[i][1];
            }
        }
        
        if(e<fs||s>fe){
                list.add(Arrays.asList(s,e));
        }
        else{
                if(s<fs){
                    list.add(Arrays.asList(s,fs-1));
                }
                if(e>fe){
                    list.add(Arrays.asList(fe+1,e));
                }
        }
        // List<List<Integer>> ad = new ArrayList<>();
        // for(int i = 0;i<list.size();i++){
        //     s = list.get(i).get(0);
        //     e = list.get(i).get(1);

            
        // }
        //list.clear();
        return list;
    }
}