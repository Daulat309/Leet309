class Solution {
    public String reverseByType(String s) {
        StringBuilder l = new StringBuilder();
        StringBuilder sl = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)>=97&&s.charAt(i)<=122) l.append(s.charAt(i));
            else sl.append(s.charAt(i));
        }
        StringBuilder ns = new StringBuilder();
        int kl = 0;
        int ksl = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>=97&&s.charAt(i)<=122) ns.append(l.charAt(kl++));
            else ns.append(sl.charAt(ksl++));
        }
        return ns.toString();
    }
}