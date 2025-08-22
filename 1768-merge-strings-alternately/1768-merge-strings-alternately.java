class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int min = Math.min( word1.length(), word2.length());
        int i = 0;
        while(i!=min){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        if(word1.length()>min){
            sb.append(word1.substring(i));
        }
        else if(word2.length()>min){
            sb.append(word2.substring(i));
        }
        return sb.toString();
    }
}