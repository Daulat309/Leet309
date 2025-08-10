class Solution {
    public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>();  
    row.add(1);                             

    for (int i = 0; i < rowIndex; i++) {    
        List<Integer> newRow = new ArrayList<>();
        newRow.add(1);                      

        for (int j = 1; j <= i; j++) {
            int val = row.get(j - 1) + row.get(j);  
            newRow.add(val);
        }

        newRow.add(1);                     
        row = newRow;                       
    }

    return row;  
}
}