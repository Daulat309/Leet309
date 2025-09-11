class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                sb.append(list.get(k));
                k++;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}