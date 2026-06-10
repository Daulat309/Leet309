class Solution {
    public List<List<Integer>> combinationSum(int[] a, int t) {
         List<List<Integer>> list = new ArrayList<>();
         List<Integer> l = new ArrayList<>();
         per(list,l,a,0,t,0);
         return list;
    }

    public void per(List<List<Integer>> list, List<Integer> l, int[] a, int s,int t,int idx){
        if(s>=t){
            if(s==t) list.add(new ArrayList<>(l));
            return;
        }

        for(int i = idx;i<a.length;i++){
            l.add(a[i]);
            s += a[i];
            per(list,l,a,s,t,i);
            s -= a[i];
            l.remove(l.size()-1);  
        }
        return;   
    }
}