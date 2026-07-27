class Solution {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> ls = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        per(0,0,target,candidates);
        return list;
    }

    public void per(int s, int idx, int x, int[] c){
        if(idx==c.length||s>=x){
            if(s==x) list.add(new ArrayList<>(ls));
            return;
        }

        per(s,idx+1,x,c);
        if(s+c[idx]<=x){
            s += c[idx];
            ls.add(c[idx]);
            per(s,idx,x,c);
            s -= c[idx];
            ls.remove(ls.size()-1);
        }
    }
}