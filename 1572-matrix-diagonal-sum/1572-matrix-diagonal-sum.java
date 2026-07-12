class Solution {
    public int diagonalSum(int[][] mat) {
        
        int m = mat.length ; //rowss
        int n = mat[0].length ; //columns
        int sum = 0;

        for(int i = 0 ; i < m ; i++)
        {
            
                sum += mat[i][i] ; //sum of primary diagnls whose i=j

                sum += mat[i][n - 1 - i];// sum of scndry diagnls

        }
            if(n % 2== 1)//if oddd matrix
            {
                sum -= mat[n/2][n/2] ; //bcz middle element is included in both diagnml sum it should be subtracted once
            }
            
        
        return sum ;
    }
}