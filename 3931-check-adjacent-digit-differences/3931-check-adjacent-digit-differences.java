class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i = 0;i<s.length()-1;i++){
            int k = s.charAt(i)-'0';
            int l = s.charAt(i+1)-'0';
            if(Math.abs(k-l)>2) return false;
        }
        return true;
    }
}