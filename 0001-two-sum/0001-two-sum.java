class Solution {
    public int[] twoSum(int[] n, int x) {
        int [] a = new int[n.length];
        for(int i = 0;i<a.length;i++) a[i] = n[i];
        Arrays.sort(a);
        int f = -1, s = -1;
        int l = 0, h = a.length-1;
        while(l<h){
            System.out.println(a[l]+"  "+a[h]);
            int sm = a[l]+a[h];
            if(sm==x){
                f = a[l];
                s = a[h];
                break;
            }
            if(sm>x) h--;
            else l++;
        }
        System.out.println(f+"  "+s);
        int fi = -1, si = -1;
        for(int i = 0;i<a.length;i++){
            if(n[i]==f){
                if(fi==-1) fi = i;
            }
            if(n[i]==s) si = i;
            if(fi==si) si = -1;
        }
        return new int[]{fi,si};
    }
}