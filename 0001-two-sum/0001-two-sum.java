class Solution {
    public int[] twoSum(int[] nums, int x) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(set.containsKey(x-nums[i])) return new int[]{set.get(x-nums[i]), i};
            set.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}