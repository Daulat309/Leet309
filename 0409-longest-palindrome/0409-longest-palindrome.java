class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int single = 0, cnt = 0;
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)%2==0){
                single--;
                cnt++;
                map.put(c,0);
            }
            else single++;
        }
        System.out.println(cnt+"  "+single);
        return single>=1?2*cnt+1:2*cnt;
    }
}