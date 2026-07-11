class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int ans[] = new int [nums.length] ;

        int pos = 0 ;//pstive elmnt will be on indices 0 , 2 , 4 ...
        int neg = 1 ;//ngtive elmnts will be on   1 3 5 ....

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] > 0)
            {
                ans[pos] = nums[i] ;
                pos += 2 ;
            }
            else{
                ans[neg] = nums[i] ;
                neg += 2 ;
        }}
        return ans ;
    }
}