class Solution { 
    public boolean isMatch(String s, String p) { 
        return check(s, p); 
    } 
 
    public boolean check(String s, String p) { 
        
        if(s.length()==0 && p.length()==0) return true;
        
        if(s.length()==0) { 
            while(1 < p.length() && p.charAt(1) == '*') {
                p = p.substring(2);
            }
            return p.length()==0;
        }
        
        if(p.length()==0) return false; 
        
        if(1 < p.length() && p.charAt(1) == '*') { 
            
            if(p.charAt(0) == '.') { 
                return check(s.substring(1), p) || 
                       check(s, p.substring(2)); 
            } 
            else { 
                if(s.charAt(0) == p.charAt(0)) { 
                    return check(s.substring(1), p) || 
                           check(s, p.substring(2)); 
                } 
                else { 
                    return check(s, p.substring(2)); 
                } 
            } 
        } 
        
        else if(p.charAt(0) == '.') { 
            return check(
                         s.substring(1), 
                         p.substring(1)); 
        } 
        
        else { 
            if(s.charAt(0) != p.charAt(0)) return false; 
            
            return check(s.substring(1), p.substring(1)); 
        } 
    } 
}