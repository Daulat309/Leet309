class Solution {
    public boolean doesAliceWin(String s) {
        int count = 0;
        int l = s.length();
        for(int i = 0;i<l;i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') count++;
        }
        if(count==0) return false;
        return true;
    }
}