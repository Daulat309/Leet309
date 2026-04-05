class Solution {
    public boolean judgeCircle(String m) {
        int i = 0, j = 0;
        for(int k = 0;k<m.length();k++){
            if(m.charAt(k)=='U') i--;
            else if(m.charAt(k)=='D') i++;
            else if(m.charAt(k)=='L') j++;
            else j--;
        }
        return i==j && i==0;
    }
}