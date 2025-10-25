class Solution {
    public int[] intersect(int[] a, int[] a2) {
        Arrays.sort(a);
        Arrays.sort(a2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int k = 0;
        for(i = 0;i<a.length;i++){
            for(j = 0;j<a2.length && k<a2.length ;j++){
                if(a[i]>a2[k]){
                    k++;
                    continue;
                }
                if(a[i]==a2[k]){
                    list.add(a[i]);
                    j++;
                    k++;
                    break;
                }
            }
        }
        int[] arr = new int[list.size()];
        for(i = 0;i<arr.length;i++) arr[i] = list.get(i);
        return arr;
    }
}