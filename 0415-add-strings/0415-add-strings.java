class Solution {
    public String addStrings(String a1, String a2) {
        StringBuilder sb = new StringBuilder();
        int i = a1.length()-1;
        int j = a2.length()-1;
        int c = 0;
        while (i >= 0 && j >= 0) {
            int a = a1.charAt(i)-'0';
            int b = a2.charAt(j)-'0';
            sb.append((a+b+c)%10);
            c = (a+b+c)/10;
            i--;
            j--;
        }
        while (i >= 0){
            int a = a1.charAt(i)-'0';
            sb.append((a+c)%10);
            c = (a+c)/10;
            i--;
        }
        while (j >= 0){
            int b = a2.charAt(j)-'0';
            sb.append((b+c)%10);
            c = (b+c)/10;
            j--;
        }
        if(c!=0) sb.append(1);
        sb.reverse();
        return sb.toString();
    }
}