class Solution {
    public List<Integer> solveQueries(int[] n, int[] q) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0;i<n.length;i++){
            map.putIfAbsent(n[i],new ArrayList<Integer>());
            map.get(n[i]).add(i);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int s : q){
            int v = n[s];
            ArrayList<Integer> list = map.get(v);

            if(list.size()==1){
                res.add(-1);
                continue;
            }

            int idx = Collections.binarySearch(list,s);
            int prev = list.get((idx-1+list.size())%list.size());
            int next = list.get((idx+1)%list.size());

            int d1 = Math.abs(s-prev);
            int d2 = Math.abs(s-next);

            d1 = Math.min(n.length-d1,d1);
            d2 = Math.min(n.length-d2,d2);
            res.add(Math.min(d1,d2));

            // System.out.println(list);
            // System.out.println(s);
            // System.out.println(idx);
            // System.out.println(prev+"  "+next);
            // System.out.println(d1+"  "+d2);
            // System.out.println();
        }
        return res;
    }
}