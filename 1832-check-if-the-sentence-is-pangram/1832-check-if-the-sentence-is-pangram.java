class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        boolean[] ar = new boolean[26];
        for(int i = 0;i<sentence.length();i++) ar[sentence.charAt(i)-'a'] = true;
        for(int i = 0;i<ar.length;i++) if(ar[i]==false) return false;
        return true;
    }
}