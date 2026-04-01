class Solution {
    public List<Integer> findPeaks(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<a.length-1;i++){
            if(a[i]>a[i-1]&&a[i]>a[i+1]) list.add(i);
        }
        return list;
    }
}