class Solution {
    public int numberOfSpecialChars(String w) {
        int[] a = new int[26];
        Arrays.fill(a,-1);
        int[] b = new int[26];
        Arrays.fill(b,-1);
        int cnt = 0;
        for(int i = 0;i<w.length();i++){
            char c = w.charAt(i);
            if(97<=c&&c<=122){
                a[c-'a'] = i;
            }
            else {
                if(b[c-'A']==-1) b[c-'A']=i;
            }
        }
        for(int i = 0;i<26;i++){
            if((a[i]!=-1&&b[i]!=-1)&&b[i]>a[i]) cnt++;
        }
        return cnt;
    }
}