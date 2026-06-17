class Solution {
    public String greatestLetter(String s) {
        int[] a = new int[26];
        int[] A = new int[26];
        Arrays.fill(a,1);
        Arrays.fill(A,1);
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                A[c-'A']--;
            }
            else{
                a[c-'a']--;
            }
        }
        for(int i = a.length-1;i>=0;i--){
            if(a[i]<1&&A[i]<1) return ""+(char)(i+'A');
        }
        return "";
    }
}