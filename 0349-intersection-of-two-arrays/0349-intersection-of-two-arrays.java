class Solution {
    public int[] intersection(int[] aa, int[] bb) {
        HashSet<Integer> set = new HashSet<>();
        int[] a = msort(aa);
        int[] b = msort(bb);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for(int i = 0;i<a.length;i++){
            if(bS(b,a[i])!=-1)set.add(a[i]);
        }
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }

    public static int[] msort(int[] a){
        if(a.length<=1) return a;
        int m = a.length/2;
        int[] l = msort(Arrays.copyOfRange(a,0,m));
        int[] r = msort(Arrays.copyOfRange(a,m,a.length));
        return merge(l,r);
    }

    public static int[] merge(int[] l, int[] r){
        int i=0,j=0,k=0;
        int[] m = new int[l.length+r.length];
        while(i<l.length&&j<r.length){
            if(l[i]<r[j]) m[k++] = l[i++];
            else m[k++] = r[j++];
        }
        while(i<l.length){
            m[k++] = l[i++];
        }
        while(j<r.length){
            m[k++] = r[j++];
        }
        return m;
    }

    public static int bS(int[] a, int x){
        int l = 0,h = a.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(a[m]==x) return a[m];
            if(a[m]<x) l = m + 1;
            else h = m-1;
        }
        return -1;
    }
}