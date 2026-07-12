class Solution {
    public void rotate(int[][] matrix) {
        
        int m = matrix.length ; 
       

        //Step 1: Transpose the matrix

        for(int i = 0 ; i < m ; i++)
        {
            for(int j = i+1 ; j < m ; j++)
            {
               int temp = matrix[i][j] ;
               matrix[i][j ] = matrix[j][i];
               matrix[j][i] = temp ;
            }

            
        }
        for(int i = 0 ; i < m ; i++)
        {
            //Step 2: Reverse every row

            int left = 0 ;
            int right = m - 1;

            while(left < right )
            {
               int temp = matrix[i][left] ;
               matrix[i][left] = matrix[i][right] ;
               matrix[i][right] = temp ;

                left++ ;
                right-- ;
            } 
        }
        
    }
}