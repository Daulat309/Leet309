class Solution {
    public long[] distance(int[] arr) {
        int n = arr.length;
        long[] res = new long[n];
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

        for(List<Integer> list : map.values()){
            int size = list.size();

            long prefix = 0;
            long total = 0;

            for(int idx : list) total += idx;

            for(int i = 0; i < size; i++){
                int idx = list.get(i);

                long left = (long)i * idx - prefix;
                long right = total - prefix - idx - (long)(size - i - 1) * idx;

                res[idx] = left + right;

                prefix += idx;
            }
        }

        return res;
    }
}