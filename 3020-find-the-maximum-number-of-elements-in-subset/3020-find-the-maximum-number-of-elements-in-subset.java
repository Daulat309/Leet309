class Solution {
    public int maximumLength(int[] a) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int oc = 0;
        int res = 1;
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0;i<a.length;i++){
            if(set1.contains(a[i])) set2.add(a[i]);
            else set1.add(a[i]);            
            if(a[i]==1) oc++;
            s.add(a[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> it = s.iterator();
        while (it.hasNext()) {
            int cur = it.next();
            while(set1.contains(cur)){
                list.add(cur);
                set1.remove(cur);
                if(set2.contains(cur)){
                    list.add(cur);
                    set2.remove(cur);
                    cur = cur * cur;
                }
            }
            if(list.size()%2 != 0) res = Math.max(res,list.size());
            else res = Math.max(res,list.size()-1);
            for(int j = 0;j<list.size();j++){
                if(set1.contains(list.get(j))) set2.add(list.get(j));
                else set1.add(list.get(j));
            }
            list.clear();
        }
        if(oc%2==0) oc = oc-1;
        return Math.max(oc,res);
    }
}