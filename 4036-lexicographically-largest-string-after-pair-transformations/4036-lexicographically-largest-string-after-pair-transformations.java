class Solution {
    public String[] largestString(int[] nums) {
        int[] f = new int[26];
        String[] res = new String[nums.length];
        int n = 0;
        for(int a : nums){
            Arrays.fill(f,0);
            f[0] = a;
            for(int i =1;i<26;i++){
                int k = f[i-1];
                int c = k/2;
                int t = k%2;
                if(k!=0){
                    f[i-1] = t;
                    f[i] = c;
                }
            }

            StringBuilder sb = new StringBuilder();

            for(int i =25;i>=0;i--){
                int k = f[i];
                while(k-->0){
                    sb.append((char)(i+'a'));
                }
            }

            res[n] = sb.toString();
            n++;
        }
        return res;
    }
}