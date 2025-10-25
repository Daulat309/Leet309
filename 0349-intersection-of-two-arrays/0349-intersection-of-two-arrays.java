class Solution {
    public int[] intersection(int[] a, int[] a2) {
        int t = 0;
        int k = 0;
        Arrays.sort(a);
        Arrays.sort(a2);
        ArrayList<Integer> list = new ArrayList<>();
        while (t < a.length && k < a2.length) {
            int curr = a[t];
            while (t < a.length && a[t] == curr) t++;

            while (k < a2.length && a2[k] < curr) k++;

            if (k < a2.length && a2[k] == curr) {
                list.add(curr);
                while (k < a2.length && a2[k] == curr) k++;
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0;i<arr.length;i++) arr[i] = list.get(i);
        return arr;
    }
}