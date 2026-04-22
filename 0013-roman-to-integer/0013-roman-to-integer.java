class Solution {
    public int romanToInt(String s) {
        int sm = 0;
        char past = s.charAt(s.length()-1);
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='I'){
                if(past=='V'||past=='X'||past=='L'||past=='C'||past=='D'||past=='M') sm-= 1;
                else sm += 1;
            }
            else if(s.charAt(i)=='V'){
                if(past=='X'||past=='L'||past=='C'||past=='D'||past=='M') sm-= 5;
                else sm += 5;
            }
            else if(s.charAt(i)=='X'){
                if(past=='L'||past=='C'||past=='D'||past=='M') sm-= 10;
                else sm += 10;
            }
            else if(s.charAt(i)=='L'){
                if(past=='C'||past=='D'||past=='M') sm-= 50;
                else sm += 50;
            }
            else if(s.charAt(i)=='C'){
                if(past=='D'||past=='M') sm-= 100;
                else sm += 100;
            }
            else if(s.charAt(i)=='D'){
                if(past=='M') sm-= 500;
                else sm += 500;
            }
            else sm+= 1000;
            past = s.charAt(i);
        }
        return sm;
    }
}