class Solution {
    public String addBinary(String a1, String a2) {
        StringBuilder sb = new StringBuilder();
        int i = a1.length()-1;
        int j = a2.length()-1;
        int c = 0;
        while (i >= 0 && j >= 0) {
            int a = a1.charAt(i)-'0';
            int b = a2.charAt(j)-'0';
            if(a+b+c==3){
                sb.append(1);
                c = 1;
            }
            else if(a+b+c==2){
                sb.append(0);
                c = 1;
            }
            else if(a+b+c==1){
                sb.append(1);
                c = 0;
            }
            else{
                sb.append(0);
                c = 0;
            }
            i--;
            j--;
        }
        while (i >= 0){
            int a = a1.charAt(i)-'0';
            if(a+c==2){
                sb.append(0);
                c = 1;
            }
            else if(a+c==1){
                sb.append(1);
                c = 0;
            }
            else{
                sb.append(0);
                c = 0;
            }
            i--;
        }
        while (j >= 0){
            int b = a2.charAt(j)-'0';
            if(b+c==2){
                sb.append(0);
                c = 1;
            }
            else if(b+c==1){
                sb.append(1);
                c = 0;
            }
            else{
                sb.append(0);
                c = 0;
            }
            j--;
        }
        if(c!=0) sb.append(1);
        sb.reverse();
        return sb.toString();
    }
}