class Solution {
    public int[] intersection(int[] aa, int[] bb) {
        Set<Integer> set1 = new HashSet<>();
        for(int x : aa) set1.add(x);
        Set<Integer> result = new HashSet<>();
        for(int x : bb)if(set1.contains(x)) result.add(x);
        int[] arr = result.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}