class Solution {
    public String addBinary(String a1, String a2) {
        StringBuilder sb = new StringBuilder();
        
        int i = a1.length() - 1;
        int j = a2.length() - 1;
        int c = 0;
        
        while (i >= 0 || j >= 0 || c == 1) {
            int sum = c;
            
            if (i >= 0) sum += a1.charAt(i--) - '0';
            if (j >= 0) sum += a2.charAt(j--) - '0';
            
            sb.append(sum % 2); 
            c = sum / 2;         
        }
        return sb.reverse().toString();
    }
}