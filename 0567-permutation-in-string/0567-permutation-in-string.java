class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int[] a = new int[256];
        int[] b = new int[256];
        for(char c : s1.toCharArray()) a[c]++;
        int l = 0, h = s1.length();
        for(int i = 0;i<h;i++) b[s2.charAt(i)]++;
        if(check(a,b)) return true;
        while(h<s2.length()){
            b[s2.charAt(h)]++;
            b[s2.charAt(l)]--;
            if(check(a,b)) return true;
            l++;
            h++;
        }
        return false;
    }


    public boolean check(int[] a, int[] b){
        for(int i = 0;i<256;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}