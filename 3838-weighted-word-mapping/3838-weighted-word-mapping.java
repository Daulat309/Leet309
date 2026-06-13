class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String s : words){
            int sm = 0;
            for(int i = 0;i<s.length();i++) sm += weights[s.charAt(i)-'a'];
            sm %= 26;
            sb.append((char)(122-sm));
        }
        return sb.toString();
    }
}