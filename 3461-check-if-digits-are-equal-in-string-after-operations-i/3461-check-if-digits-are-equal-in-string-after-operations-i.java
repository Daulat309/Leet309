class Solution {
    public boolean hasSameDigits(String s) {
        int l = s.length();
        if(l<2) return false;
        if(l==2){
            if(s.charAt(0)==s.charAt(1)) return true;
            else return false;
        }    
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<l-1;i++){
            int a = (int)((s.charAt(i)+'0'))+(int)((s.charAt(i+1)+'0'));
            sb.append(a%10);
        }
        return hasSameDigits(sb.toString());
    }
}