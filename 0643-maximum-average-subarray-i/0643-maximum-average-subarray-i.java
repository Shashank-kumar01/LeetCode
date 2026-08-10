class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        int j  ;

        for(j = 0 ; j < k ; j++)
        {
            sum += nums[j] ;

        }
         double maxAvg = (double) sum / k;
        
        int i = 0 ;
        while( j < nums.length)
        {
            sum = sum + nums[j] - nums[i] ;
            double avg =(double) sum / k ;
            maxAvg = Math.max(maxAvg , avg) ;

            i++ ;
            j++ ;
        }
        return maxAvg ;
    }
}