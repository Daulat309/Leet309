class Solution {
    public boolean canConstruct(String w, String x) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : x.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : w.toCharArray()){
            int freq = map.getOrDefault(c, 0);

            if (freq == 0) {
                return false;
            }

            map.put(c, freq - 1);
        }
        return true;
    }
}