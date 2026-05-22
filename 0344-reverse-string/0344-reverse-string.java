class Solution {
    public void reverseString(char[] s) {
        rev(s,0,s.length-1);
    }

    public void rev(char[] s, int l, int h){
        if(l>h) return;
        char t = s[l];
        s[l] = s[h];
        s[h] = t;
        rev(s,l+1,h-1);
    }
}