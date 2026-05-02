class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(n);
        for(int i = 0;i<n.length-2;i++){
            for(int j = i + 1;j<n.length-1;j++){
                int s = n[i]+n[j];
                int x = 0 - s;
                int start = j+1;
                int end = n.length-1;
                int bs = bS(n,start,end,x);
                if(bs!=1000000){
                    list.add(Arrays.asList(n[i], n[j], bs));
                }
                while(j+1<n.length&&n[j]==n[j+1]) j++;
            }
            while(i+1<n.length-1&&n[i]==n[i+1]) i++;
        }
        return list;
    }

    public static int bS(int[] a, int s, int e, int x){
        while(s<=e){
            int md = s+(e-s)/2;
            if(a[md]==x) return x;
            if(a[md]<x) s = md+1;
            else e = md-1;
        }
        return 1000000;
    }
}