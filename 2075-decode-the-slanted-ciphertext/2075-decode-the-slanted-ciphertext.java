class Solution {
    public String decodeCiphertext(String s, int r) {
        if(s.length()==0)return s;
        StringBuilder sb = new StringBuilder();
        int col = s.length()/r;
        for (int i = 0; i < col; ++i)
        for (int j = i; j < s.length(); j += col + 1) sb.append(s.charAt(j));
        return sb.toString().stripTrailing();
    }
}