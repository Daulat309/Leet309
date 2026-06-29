class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length()<p.length()) return list;
        int[] a = new int[256];
        int[] b = new int[256];
        for(char c : p.toCharArray()) a[c]++;
        int l = 0, h = p.length();
        for(int i = l;i<h;i++){
            b[s.charAt(i)]++;
        }
        if(check(a,b)) list.add(l);

        while(h<s.length()){
            b[s.charAt(h)]++;
            b[s.charAt(l)]--;
            h++;
            l++;
            if(check(a,b)) list.add(l);
        }
        return list;
    }


    public boolean check(int[] a, int[] b){
        for(int i = 0;i<256;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}