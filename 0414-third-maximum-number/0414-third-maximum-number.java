class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length<2) return nums[0];
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        nums = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(nums.length);
        if(nums.length<2) return nums[0];
        if(nums.length<3) return nums[1];
        return nums[nums.length-1-2];
    }
}