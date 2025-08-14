class Solution {
    public String largestGoodInteger(String num) {
        int first = num.charAt(0) - '0';
        int max = -1;
        for(int i = 1;i < num.length()-1;i++){
            int second = num.charAt(i) - '0';
            int third = num.charAt(i+1) - '0';
            if(first==second&&first==third){
                if(max<first) max = first;
                if(i+2<num.length())first = num.charAt(i+2) - '0';
                i += 2;
            }
            else first = num.charAt(i) - '0';
        }
        StringBuilder sb = new StringBuilder();
        sb.append(max);
        sb.append(max);
        sb.append(max);
        return max==-1?"":sb.toString();
    }
}