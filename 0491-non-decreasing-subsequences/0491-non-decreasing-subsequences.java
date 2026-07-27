class Solution {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> ls = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        subseq(nums,0);
        return list;
    }

    public void subseq(int[] a, int idx){
        if(ls.size()>1)list.add(new ArrayList<>(ls));
        HashSet<Integer> set = new HashSet<>();
        for(int i = idx;i<a.length;i++){
            if(set.contains(a[i])) continue;
            if(ls.isEmpty()||a[i]>=ls.get(ls.size()-1)){
                set.add(a[i]);
                ls.add(a[i]);
                subseq(a,i+1);
                ls.remove(ls.size()-1);
            }
        }
    }
}