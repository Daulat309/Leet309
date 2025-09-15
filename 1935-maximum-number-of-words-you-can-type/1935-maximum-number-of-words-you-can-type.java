class Solution {
    public int canBeTypedWords(String text, String bL) {
        int p = text.length();
        int q = bL.length();
        int cnt = 0;
        boolean[] arr = new boolean[26];
        for(int k = 0;k<q;k++){
            arr[bL.charAt(k)-'a'] = true;
        }
        for(int k = 0;k<p;k++){
            boolean isit = false;
            while(k<p&&text.charAt(k)!=' '){
                if(arr[text.charAt(k)-'a']) isit = true;
                k++;
            }
            if(!isit) cnt++;
        }
        return cnt;
    }
}