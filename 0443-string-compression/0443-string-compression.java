class Solution {
    public int compress(char[] chars) {
        int k = 0, n = chars.length, cnt = 1;
        if(n==1) return 1;
        char p = chars[0];
        for(int i = 1;i<n;i++){
            if(chars[i]!=p){
                chars[k] = p;
                k++;
                if(cnt>1){
                int l = k;
                while(cnt>0){
                    chars[k] =(char) ((char)(cnt % 10)+'0');
                    k++;
                    cnt /= 10;
                }
                int h = k - 1;

                while(l<=h){
                    char t = chars[l];
                    chars[l] = chars[h];
                    chars[h] = t;
                    l++;
                    h--;
                }
                }
                p = chars[i];
                cnt = 1;
            }
            else cnt++;
        }
        chars[k] = p;
        k++;
        if(cnt>1){
                int l = k;
                while(cnt>0){
                    chars[k] =(char) ((char)(cnt % 10)+'0');
                    k++;
                    cnt /= 10;
                }
                int h = k - 1;

                while(l<=h){
                    char t = chars[l];
                    chars[l] = chars[h];
                    chars[h] = t;
                    l++;
                    h--;
                }
            }
        return k;
    }
}