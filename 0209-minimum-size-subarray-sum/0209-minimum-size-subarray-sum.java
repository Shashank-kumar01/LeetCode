class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int low = 0 , high = 0 , sum = 0 , ans = Integer.MAX_VALUE ;

        while(high < nums.length)
        {
            sum = sum + nums[high] ;

            while(sum >= target)
            {
                ans = Math.min(ans , high - low + 1) ;

                sum = sum - nums[low] ;
                low++ ;
            }
            high++ ;
        }
        if(ans == Integer.MAX_VALUE)
            return 0 ;

        else
            return ans ;
        
    }
}