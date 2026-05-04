class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0, h = 0, mxl = 0;
        while(h<s.length()){
            freq[s.charAt(h)-'A']++;
            int len = h - l +1;
            int mxc = Mxc(freq);
            int diff = len - mxc;
            while(diff>k&&l<=h){
                freq[s.charAt(l++)-'A']--;
                len = h - l +1;
                mxc = Mxc(freq);
                diff = len - mxc;
            }
            mxl = Math.max(h-l+1,mxl);
            h++;
        }
        return mxl;
    }

    public int Mxc(int[] a){
        int mxc = 0;
        for(int i : a) mxc = Math.max(mxc,i);
        return mxc;
    }
}