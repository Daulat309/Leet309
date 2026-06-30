class Solution {
    public int numberOfSubstrings(String s) {
        int cnt = 0;
        
        int l = 0, h= 0;

        int[] a = new int[3];
        //HashMap<Character, Integer> map = new HashMap<>();

        while(h<s.length()){

            a[s.charAt(h)-'a']++;
            while(a[0]>0&&a[1]>0&&a[2]>0){
                cnt += s.length() - h;
                a[s.charAt(l)-'a']--;
                l++;
            }

            // map.put(s.charAt(h),map.getOrDefault(s.charAt(h),0)+1);
            // while(map.size()==3){
            //     cnt += s.length() - h;
            //     map.put(s.charAt(l),map.get(s.charAt(l))-1);
            //     if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
            //     l++;
            // }
            h++;
        }
        return cnt;
    }
}