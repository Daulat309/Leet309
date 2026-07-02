class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length-1];
        int idx = 0;
        while(idx<a.length()&&idx<b.length()){
            if(a.charAt(idx)!=b.charAt(idx)) break;
            idx++;
        }
        return a.substring(0,idx);
    }
}