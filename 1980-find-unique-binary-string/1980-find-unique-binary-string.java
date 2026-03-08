class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Arrays.sort(nums);
        int k = 0;
        int n = nums[0].length();
        String[] arr = new String[1 << n];
        for(int i = 0; i < (1 << n); i++){
            arr[i] = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));
        for(int i = 0;i<nums.length;i++){
            if(!nums[i].equals(arr[i])) return arr[i];
        }
        return arr[nums.length];
    }
}