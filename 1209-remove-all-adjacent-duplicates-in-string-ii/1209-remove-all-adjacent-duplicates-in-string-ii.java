class Pair{
    char ch;
    int freq;

    Pair(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<Pair> st = new Stack<>();

        for(char c : s.toCharArray()){

            if(!st.isEmpty() && st.peek().ch == c){

                st.peek().freq++;

                if(st.peek().freq == k)
                    st.pop();

            }else{
                st.push(new Pair(c, 1));
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){

            Pair p = st.pop();

            for(int i = 0; i < p.freq; i++)
                sb.append(p.ch);
        }

        return sb.reverse().toString();
    }
}