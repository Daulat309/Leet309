class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] f = new int[52];
        for(int i = 0;i<s1.length();i++){
            int of = (i&1)*26;
            f[s1.charAt(i)-'a' + of]++;
            f[s2.charAt(i)-'a' + of]--;
        }
        for(int i = 0;i<52;i++){
            if(f[i]!=0) return false;
        }
        return true;
    }
}