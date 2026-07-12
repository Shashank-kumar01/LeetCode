class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = 2 * nums.length ;

        int ans[] = new int[n] ;
        int j = 0;

        for(int i = 0 ; i < n ; i++)
        {
            if(j == n/2)
            {
                j = 0;
                i-- ;
            }
            else
            {
                ans[i] = nums[j] ;
                j++ ;
            }
            
        }
        return ans ;
        
    }
}