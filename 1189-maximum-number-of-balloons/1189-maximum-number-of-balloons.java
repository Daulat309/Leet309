class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        int mn = Integer.MAX_VALUE;
        for(int i = 0;i<text.length();i++){
            char c = text.charAt(i);
            if(c=='b'||c=='a'||c=='l'||c=='o'||c=='n'){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        for(int i = 0;i<text.length();i++){
            char c = text.charAt(i);
            if(c=='b'||c=='a'||c=='l'||c=='o'||c=='n'){
                if(c=='l'||c=='o') mn = Math.min(map.get(c)/2,mn);
                else mn = Math.min(map.get(c),mn);
            }
        }
        return map.size()==5?mn:0;
    }
}