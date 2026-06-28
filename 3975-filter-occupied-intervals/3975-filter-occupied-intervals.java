class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] o, int fs, int fe) {
        Arrays.sort(o,(a,b)->a[0]-b[0]);
        int s = o[0][0];
        int e = o[0][1];
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1;i<o.length;i++){
            if(o[i][0]<=e) e = Math.max(o[i][1],e);
            else{
                list.add(Arrays.asList(s,e));
                s = o[i][0];
                e = o[i][1];
            }
        }
        
        list.add(Arrays.asList(s,e));
        List<List<Integer>> ad = new ArrayList<>();
        boolean change = false;
        for(int i = 0;i<list.size();i++){
            s = list.get(i).get(0);
            e = list.get(i).get(1);
            if(e<fs||s>fe){
                ad.add(Arrays.asList(s,e));
            }
            else{
                if(s<fs){
                    ad.add(Arrays.asList(s,fs-1));
                }
                if(e>fe){
                    ad.add(Arrays.asList(fe+1,e));
                }
            }
            
        }
        list.clear();
        System.out.println(ad);
        if(ad.size()==0) return list;
        s = ad.get(0).get(0);
        e = ad.get(0).get(1);
        for(int i = 1;i<ad.size();i++){
            if(e+1==ad.get(i).get(0)) e = ad.get(i).get(1);
            else{
                list.add(Arrays.asList(s,e));
                s = ad.get(i).get(0);
                e = ad.get(i).get(1);
            }
        }
        list.add(Arrays.asList(s,e));
        return list;
    }
}