class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<nums.length;i++) sb.append(nums[i]);
        String a1 = sb.toString();
        String a2 = String.valueOf(k);
        System.out.println(a1);
        System.out.println(a2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = a1.length()-1;
        int j = a2.length()-1;
        int c = 0;
        while (i >= 0 && j >= 0) {
            int a = a1.charAt(i)-'0';
            int b = a2.charAt(j)-'0';
            list.add((a+b+c)%10);
            c = (a+b+c)/10;
            i--;
            j--;
        }
        while (i >= 0){
            int a = a1.charAt(i)-'0';
            list.add((a+c)%10);
            c = (a+c)/10;
            i--;
        }
        while (j >= 0){
            int b = a2.charAt(j)-'0';
            list.add((b+c)%10);
            c = (b+c)/10;
            j--;
        }
        if(c!=0) list.add(c);
        Collections.reverse(list);
        return list;
    }
}