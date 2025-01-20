// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        List<Integer>first_row=new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for(int i=1;i<numRows;i++){
            List<Integer>prev_row=triangle.get(i-1);
            List<Integer>curr=new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev_row.get(j-1)+prev_row.get(j));
            }
            curr.add(1);
            triangle.add(curr);
        }
        return triangle;
    }
}
