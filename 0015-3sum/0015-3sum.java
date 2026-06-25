class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<a.length-2;i++){

            if(i>0&&a[i]==a[i-1]) continue;
            int x = -1*a[i];
            int l = i + 1, h = a.length-1;
            while(l<h){
                int sm = a[l]+a[h];
                if(sm==x){
                    list.add(new ArrayList<>(Arrays.asList(a[i], a[l], a[h])));
                    l++;
                    h--;
                    while(l<h&&a[l]==a[l-1]) l++;
                    while(h>l&&a[h]==a[h+1]) h--;
                }
                else{
                   if(sm>x) h--;
                   else l++;
                }
            }
        }
        return list;
    }
}