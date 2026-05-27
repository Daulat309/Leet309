class Solution {
    public boolean canConstruct(String w, String x) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : x.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : w.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) map.remove(c);
            }
            else return false;
        }
        return true;
    }
}