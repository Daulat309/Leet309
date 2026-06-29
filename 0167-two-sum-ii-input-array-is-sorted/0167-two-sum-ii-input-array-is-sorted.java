class Solution {
    public int[] twoSum(int[] n, int x) {
        int l = 0, h = n.length-1;
        int a = -1, b = -1;
        while(l<h){
            int sm = n[l]+n[h];
            if(sm==x){
                a = l;
                b = h;
                break;
            }
            if(sm>x) h--;
            else l++;
        }

        return new int[] {l+1,h+1};





















        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0;i<numbers.length;i++){
        //     int r = target - numbers[i];
        //     if(map.containsKey(r)) return new int[]{map.get(r)+1,i+1};
        //     map.put(numbers[i],i);
        // }
        // return  new int[]{-1,-1};
    }
}