class Solution {
    public int totalFruit(int[] fr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int l = 0, h = 0, mxc = 0;
        while(h<fr.length){
            int c = fr[h];
            freq.put(c,freq.getOrDefault(c,0)+1);
            while(freq.size()>2){
                int ch = fr[l];
                freq.put(ch,freq.get(ch)-1);
                if(freq.get(ch)==0) freq.remove(ch);
                l++;
            }
            if(freq.size()<=2) mxc = Math.max(mxc,h-l+1);
            h++;
        }
        return mxc;
    }
}