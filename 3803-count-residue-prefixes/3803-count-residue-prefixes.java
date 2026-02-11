class Solution {
    public int residuePrefixes(String s) {
        boolean is[] = new boolean[123];
        int count = 0;
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            if(is[s.charAt(i)]==false){
                count++;
                is[s.charAt(i)] = true;
            }
            if(count==(i+1)%3) ans++;
        }
        return ans;
    }
}