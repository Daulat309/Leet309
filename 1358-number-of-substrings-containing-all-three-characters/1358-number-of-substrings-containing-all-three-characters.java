class Solution {
    public int numberOfSubstrings(String s) {
        int cnt = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, h= 0;
        while(h<s.length()){
            map.put(s.charAt(h),map.getOrDefault(s.charAt(h),0)+1);
            while(map.size()==3){
                cnt += s.length() - h;
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
                l++;
            }
            h++;
        }
        return cnt;
    }
}