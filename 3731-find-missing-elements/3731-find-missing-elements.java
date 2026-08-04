class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int mn = nums[0];
        int mx = nums[nums.length-1];
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            if(nums[i]==mn){
                mn++;
                i++;
            }
            else{
                list.add(mn);
                mn++;
            }
        }
        return list;
    }
}