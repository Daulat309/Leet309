class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(n);

        for(int i = 0;i<n.length-2;i++){
            if(i > 0 && n[i] == n[i - 1]) continue;
            int x = -n[i];
            int l = i + 1, h = n.length-1;
            while(l<h){
                int sm = n[l]+n[h];
                if(sm==x){
                    list.add(Arrays.asList(n[i],n[l],n[h]));
                    l++;
                    h--;
                    while(l<h&&n[l]==n[l-1]) l++;
                    while(l<h&&n[h]==n[h+1]) h--;
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