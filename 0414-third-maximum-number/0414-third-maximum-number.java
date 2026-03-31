class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) set.add(i);
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        int n = arr.length;
        if (n < 3) return arr[n - 1];
        return arr[n - 3];
    }
}