class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = new char[s.length()];
        char[] ch2 = new char[t.length()];
        for(int i = 0 ;i<s.length();i++){
            ch1[i] = s.charAt(i);
        }
        for(int i = 0 ;i<t.length();i++){
            ch2[i] = t.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(ch1);
        System.out.println(ch2);
        return Arrays.equals(ch1,ch2);
    }
}