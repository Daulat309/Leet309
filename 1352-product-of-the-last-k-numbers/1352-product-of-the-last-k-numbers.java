class ProductOfNumbers {
    ArrayList<Integer> list = new ArrayList<>();

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int n = list.size();
        int mul = 1;

        if(k > n) return 0;

        for(int i = n - 1; i >= n - k; i--) {
            mul *= list.get(i);
        }

        return mul;
    }
}


/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */