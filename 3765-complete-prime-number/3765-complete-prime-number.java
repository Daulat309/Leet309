class Solution {
    public boolean completePrime(int num) {
        String s = String.valueOf(num);
        for(int i = 1; i <= s.length(); i++) {
            int x = Integer.parseInt(s.substring(0, i));
            if(!fun(x)) return false;
        }
        for(int i = 0; i < s.length(); i++) {
            int x = Integer.parseInt(s.substring(i));
            if(!fun(x)) return false;
        }
        return true;
    }
    boolean fun(int num) {
        if(num <= 1) return false;
        if(num <= 3) return true;
        if(num % 2 == 0 || num % 3 == 0) return false;
        for(int i = 5; i * i <= num; i += 6) {
            if(num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}