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
        if(map.size()!=5) return 0;
        String s= "balon";
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='l'||c=='o') mn = Math.min(map.get(c)/2,mn);
            else mn = Math.min(map.get(c),mn);
        }
        return mn;
    }
}