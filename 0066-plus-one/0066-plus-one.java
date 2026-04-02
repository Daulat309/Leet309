class Solution {
    public int[] plusOne(int[] d) {
        int car = 1;
        for(int i = d.length-1;i>=0;i--){
            int t = d[i];
            d[i] = (d[i]+car)%10;
            car = (t+car)/10;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(car!=0){
            while(car>0){
                list.add(car%10);
                car /= 10;
            }
            int[] a = new int[list.size()+d.length];
            int i = 0;
            for(i = 0;i<list.size();i++) a[i]=list.get(list.size()-1-i);
            for(i = i;i<a.length;i++) a[i]=d[i-list.size()];
            return a;
        }
        return d;
    }
}