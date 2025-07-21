
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char past = s.charAt(0);
        sb.append(s.charAt(0));
        int c = 1;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)==past&&c>=2){
                continue;
            }
            else{
                sb.append(s.charAt(i));
                if(s.charAt(i)!=past){
                    c = 1;
                    past = s.charAt(i);
                }
                else{
                    c++;
                }
            }        
        }
        return sb.toString();
    }
}