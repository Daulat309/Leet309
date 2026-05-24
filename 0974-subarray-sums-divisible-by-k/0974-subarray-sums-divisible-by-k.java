class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int sum = 0;
        int cnt = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int num : nums) {

            sum += num;

            // raw java modulo
            int rem = sum % k;

            // search same remainder
            cnt += map.getOrDefault(rem, 0);

            // search equivalent negative/positive class
            if (rem >= 0) {
                cnt += map.getOrDefault(rem - k, 0);
            } else {
                cnt += map.getOrDefault(rem + k, 0);
            }

            // store raw remainder
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return cnt;
    }
}