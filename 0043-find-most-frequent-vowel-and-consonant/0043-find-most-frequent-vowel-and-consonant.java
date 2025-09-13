class Solution {
    public int maxFreqSum(String s) {
        int l = s.length();
        int cmax = 0;
        int vmax = 0;
        int[] carr = new int[123];
        int[] varr = new int[123];
        for(int i = 0;i<l;i++){
            char ch = s.charAt(i);
            switch (ch){
                case 'a','e','i','o','u' :
                    varr[(int)ch]++;
                    if(varr[(int)ch]>vmax) vmax = varr[(int)ch];
                    break;
                case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z' :
                    carr[(int)ch]++;
                    if(carr[(int)ch]>cmax) cmax = carr[(int)ch];
                    break;
                default : System.out.println();
            }
        }
        return cmax + vmax;
    }
}