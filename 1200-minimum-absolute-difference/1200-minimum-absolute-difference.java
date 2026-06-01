class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int mn = Integer.MAX_VALUE;
        for(int i = 1;i<arr.length;i++){
            List<Integer> l = new ArrayList<>();
            if(Math.abs(arr[i]-arr[i-1])<mn){
                list.clear();
                l.add(arr[i-1]);
                l.add(arr[i]);
                list.add(l);
                mn = Math.abs(arr[i]-arr[i-1]);
            }
            else if(arr[i]-arr[i-1]==mn){
                l.add(arr[i-1]);
                l.add(arr[i]);
                list.add(l);
            }
        }
        return list;
    }
}