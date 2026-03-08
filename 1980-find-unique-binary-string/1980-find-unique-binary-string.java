class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Arrays.sort(nums);
        int k = 0;
        int n = nums[0].length();
        String[] arr = new String[1 << n];
        for(int i = 0; i < (1 << n); i++){
            String s = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
            if(k < nums.length && !s.equals(nums[k++])) return s;
        }
        return String.format("%" + n + "s", Integer.toBinaryString(1 << n - 1)).replace(' ', '0');
    }
}