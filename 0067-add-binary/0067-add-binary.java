class Solution {
    public String addBinary(String a1, String a2) {
        ArrayList<Integer> list = new ArrayList<>();
        int c = 0;
        int i = a1.length()-1, j = a2.length()-1;
        while(i>=0&&j>=0){
            int s = a1.charAt(i)-'0' + a2.charAt(j)-'0' + c;
            if(s==2||s==3) c = 1;
            else c = 0;
            if(s==3||s==1) s = 1;
            else s = 0;
            list.add(0,s);
            System.out.println(list);
            i--;
            j--;
        }
        while(i>=0){
            int s = a1.charAt(i)-'0' + c;
            if(s==2) c = 1;
            else c = 0;
            if(s==1) s = 1;
            else s = 0;
            list.add(0,s);
            System.out.println(list);
            i--;
        }
        while(j>=0){
            int s = a2.charAt(j)-'0' + c;
            if(s==2) c = 1;
            else c = 0;
            if(s==1) s = 1;
            else s = 0;
            list.add(0,s);
            System.out.println(list);
            j--;
        }
        if(c!=0) list.add(0,c);
        StringBuilder sb = new StringBuilder();
        i = 0;
        while(i<list.size()){
            sb.append(list.get(i));
            i++;
        }
        return sb.toString();
    }
}