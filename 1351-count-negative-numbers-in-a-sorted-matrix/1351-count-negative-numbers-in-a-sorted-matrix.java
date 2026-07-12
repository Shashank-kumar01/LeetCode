class Solution {
    public int countNegatives(int[][] grid) {
        
        int rows = grid.length ;
        int colums = grid[0].length ;

        int row = rows - 1 ;
        int col = 0 ; //grid[row][col] points the bottom left of the array

        int count = 0 ;
        //logic : if the curr element is negative the all the right elements after it will also be negative bcz it is in non increasing order.
        while(row >= 0 && col < colums)
        {
            if(grid[row][col] < 0)
            {
                count += colums - col ;  
                row-- ;  //count the negative and move up in matrix
            }
            else
                col++ ;
        }
        return count ;
    }
}