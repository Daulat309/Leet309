class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for(int i = 0;i<arr.length;i++) set.add(arr[i]);
        HashMap<Integer, Integer> map = new HashMap<>();
        int k = 1;
        for(Integer i : set){
            map.put(i,k);
            k++;
        }
        for(int i = 0;i<arr.length;i++) arr[i] = map.get(arr[i]);
        return arr;
    }
}