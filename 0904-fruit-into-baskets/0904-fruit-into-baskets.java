class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0, h = 0, mx = 0;
        while(h<fruits.length){
            map.put(fruits[h],map.getOrDefault(fruits[h],0)+1);
            while(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0) map.remove(fruits[l]);
                l++;
            }
            mx = Math.max(h-l+1,mx);
            h++;
        }
        return mx;
    }
}