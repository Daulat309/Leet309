class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<text.length();i++){
            char c = text.charAt(i);
            if(c=='b'||c=='a'||c=='l'||c=='o'||c=='n'){
                map.put(c,map.getOrDefault(c,0)+1);
            }
           
        }
        int mn = Integer.MAX_VALUE;
        if(map.size()<5) return 0;
        for(Character c : map.keySet()){
                if(c=='o'||c=='l') mn = Math.min(map.get(c)/2,mn);
                else mn = Math.min(map.get(c),mn);
        }
        return mn;
    }
}