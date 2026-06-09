class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i<nums.length;i++) l.add(nums[i]);
        per(list,l,0);
        return list;
    }

    public void per(List<List<Integer>> list, List<Integer> l,int idx){
        if(idx==l.size()){
            list.add(new ArrayList<>(l));
            return;
        }

        for(int i = idx;i<l.size();i++){
            swap(l,idx,i);
            per(list,l,idx+1);
            swap(l,idx,i);
        }
        return;
    }

    public void swap(List<Integer> l, int idx, int i){
        int t = l.get(i);
        l.set(i,l.get(idx));
        l.set(idx,t);
    }
}