class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] ef1 = new int[26];
        int[] of1 = new int[26];
        int[] ef2 = new int[26];
        int[] of2 = new int[26];
        for(int i = 0;i<s1.length();i += 2){
            ef1[s1.charAt(i)-'a']++;
            ef2[s2.charAt(i)-'a']++;
        }
        for(int i = 1;i<s1.length();i += 2){
            of1[s1.charAt(i)-'a']++;
            of2[s2.charAt(i)-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(ef1[i]!=ef2[i] || of1[i]!=of2[i]) return false;
        }
        return true;
    }
}