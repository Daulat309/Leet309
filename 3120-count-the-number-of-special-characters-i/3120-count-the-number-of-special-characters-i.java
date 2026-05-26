class Solution {
    public int numberOfSpecialChars(String w) {
        int[] a = new int[123];
        int cnt = 0;
        for(int i = 0;i<w.length();i++){
            char c = w.charAt(i);
            if(65<=c&&c<=90){
                if(a[c+32]==1){
                    a[c]=2;
                    a[c+32]=2;
                    cnt++;
                }
                else if (a[c]==0)a[c]++;
            }
            else {
                if(a[c-32]==1){
                    a[c]=2;
                    a[c-32]=2;
                    cnt++;
                }
                else if (a[c]==0)a[c]++;
            }
        }
        return cnt;
    }
}