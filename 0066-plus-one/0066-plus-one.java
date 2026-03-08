class Solution {
    public int[] plusOne(int[] d) {
        ArrayList<Integer> list = new ArrayList<>();
        int car = 1;
        for(int i = d.length-1;i>=0;i--){
            list.add(0,((d[i]+car)%10));
            car = (d[i]+car)/10;
        }
        if(car!=0)list.add(0,car);
        int[] ar = new int[list.size()];
        for(int i = 0;i<ar.length;i++) ar[i] = list.get(i);
        return ar;
    }
}