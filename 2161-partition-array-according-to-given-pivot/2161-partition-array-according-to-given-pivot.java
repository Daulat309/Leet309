class Solution {
    public int[] pivotArray(int[] a, int p) {
        int c = 0, idx = 0;
        int[] r = new int[a.length];
        for(int i : a){
            if(i<p) idx++;
            if(i==p) c++;
        }
        int l = 0,h = idx+c;
        //List<Integer> list = new ArrayList<>();
        //for(int i = 0;i<a.length;i++) list.add(0);
        for(int i = 0;i<a.length;i++){
            if(a[i]==p){
                r[idx] = a[i];
                idx++;
            }
            else if(a[i]<p){
                r[l] = a[i];
                l++;
            }
            else{
                r[h] = a[i];
                h++;
            }
        }
        // System.out.println(list);
        // for(int i = 0;i<a.length;i++){
        //     a[i] = list.get(i);
        // }
        return r;
    }
}