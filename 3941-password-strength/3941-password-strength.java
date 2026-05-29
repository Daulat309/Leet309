class Solution {
    public int passwordStrength(String p) {
        HashSet<Character> map = new HashSet<>();
        int r = 0;
        for(int i = 0;i<p.length();i++){
            char c = p.charAt(i);
            if(Character.isDigit(c)){
                if(!map.contains(c)){
                    map.add(c);
                    r += 3;
                }
            }
            else if(Character.isLowerCase(c)){
                if(!map.contains(c)){
                    map.add(c);
                    r += 1;
                }
            }
            else if(Character.isUpperCase(c)){
                if(!map.contains(c)){
                    map.add(c);
                    r += 2;
                }
            }
            else {
                if(!map.contains(c)){
                    map.add(c);
                    r += 5;
                }
            }
        }
        return r;
    }
}