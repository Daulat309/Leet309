class Solution {
    public int maxNumberOfBalloons(String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int cnt = 0;
        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        while(true){
            String s= "balloon";
            for(char c : s.toCharArray()){
                if(!map.containsKey(c)||map.get(c)==0) return cnt;
                map.put(c,map.getOrDefault(c,0)-1);
            }
            cnt++;
        }
    }
}