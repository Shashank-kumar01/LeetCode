class Solution {
    public int maxWidthRamp(int[] nums) {

        int n = nums.length ;

        if (n == 0) return 0;

        int leftMax[] = new int [n] ;
        int rightMax[] = new int [n];

        leftMax[0] = nums[0] ;

        for(int i = 1 ; i < n ; i++)
            leftMax[i] = Math.min(leftMax[i - 1] , nums[i]);
        
        rightMax[n - 1] = nums[n-1];

        for(int i = n-2 ; i >= 0 ; i--)
            rightMax[i] = Math.max(rightMax[i+1] , nums[i]) ;

        int i = 0 , j = 0 , maxWidth = 0;

        while(i < n && j < n)
        {
            if(leftMax[i] <= rightMax[j])
            {
                maxWidth = Math.max(maxWidth , j-i);
                j++ ;
            }

            else
                i++ ;
        }
        return maxWidth ;
    
    }
}