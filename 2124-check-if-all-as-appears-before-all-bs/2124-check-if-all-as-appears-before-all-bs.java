class Solution {
    public boolean checkString(String s) {
        int k = 1;
        for(char c : s.toCharArray()){
            if(c=='a'){
                if(k==-1) return false;
                k = 0;
            }
            else{
                k = -1;
            }
        }
        return true;
    }
}