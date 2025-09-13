class Solution {
    public int maxFreqSum(String s) {
        int l = s.length();
        int cmax = 0;
        int vmax = 0;
        int[] varr = new int[123];
        for(int i = 0;i<l;i++){
            char ch = s.charAt(i);
            switch (ch){
                case 'a','e','i','o','u' :
                    varr[(int)ch]++;
                    vmax = Math.max(vmax,varr[(int)ch]);
                    break;
                default :
                    varr[(int)ch]++;
                    cmax = Math.max(cmax,varr[(int)ch]);
            }
        }
        return cmax + vmax;
    }
}