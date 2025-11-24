class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> list = new ArrayList<>();
        int v = 0;
        for(int i : nums){
            v = ((v<<1)+i)%5;
            list.add(v==0);
        }
        return list;
    }
}