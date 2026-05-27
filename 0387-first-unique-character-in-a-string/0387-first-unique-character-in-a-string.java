class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        //HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            //map2.putIfAbsent(ch,i);
        }
        System.out.println(map);
        // for(Map.Entry<Character,Integer> e : map.entrySet()){
        //     if(e.getValue()==1) return map2.get(e.getKey());
        // }
        for(int i = 0;i<s.length();i++){
            if(map.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
}