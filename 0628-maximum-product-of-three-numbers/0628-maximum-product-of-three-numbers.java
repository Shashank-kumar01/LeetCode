class Solution {
    public int maximumProduct(int[] nums) {

        int max1 = Integer.MIN_VALUE ;
        int max2 = max1 ; 
        int max3 = max2 ;

        int min1 = Integer.MAX_VALUE ;
        int min2 = min1 ;

        for(int i = 0 ; i < nums.length ; i++)
        {
            //find largesst three
            if(nums[i] >= max1)
            {
                max3 = max2 ;
                max2 = max1 ; 
                max1 = nums[i];
            }
            else if(nums[i] >= max2 )
            {
                max3 = max2 ;
                max2 = nums[i] ; 
            }
            else if(nums[i] > max3 )
            {
                max3 = nums[i] ;
            }
            //find smallest 2

            if(min1 >= nums[i])
            {
                min2 = min1 ;
                min1 = nums[i] ;
            }
            else if(min2 > nums[i])
                min2 = nums[i] ;

        }
        return Math.max(max1 * max2 * max3 , min1 * min2 * max1);
        
    }
}