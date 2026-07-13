class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int mn = noD(low);
        int mx = noD(high);
        for(int i = mn;i<=mx;i++){
            formn(i,list,low,high);
        }
        return list;
    }

    public int noD(int n){
        int x = 0;
        while(n>0){
            x++;
            n /= 10;
        }
        return x;
    }

    public void formn(int d, ArrayList<Integer> list, int l, int h){
        for(int i = 1;i<=10-d;i++){
            int x = 0;
            int cur = i;
            for(int j = 0;j<d;j++){
                x = x*10 + cur;
                cur++;
            }
            if(x>h) break;
            if(x<l) continue;
            list.add(x);
        }
    }
}