class Solution {
    public int threeSumClosest(int[] n, int x) {
        Arrays.sort(n);
        int s = n[0]+n[1]+n[2];
        int diff = 2001;
        for(int i = 0;i<n.length-2;i++){
            if(i > 0 && n[i] == n[i-1]) continue;
            int l = i + 1, h = n.length-1;
            while(l<h){
                int sm = n[i]+n[l]+n[h];
                if(Math.abs(s-x)>Math.abs(sm-x)){
                    s = sm;
                }
                if(sm>x) h--;
                else l++;
                //else return sm;
            }
        }
        return s;
    }
}