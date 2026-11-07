class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {

        int low = 1;
        int high =10000000 ;

        int ans = -1 ;
        int n = dist.length - 1 ;

        while(low <= high)
        {
            int mid = low + (high - low) / 2 ;

            double totalTime = 0 ;

            for(int i = 0 ; i <= n ; i++)
            {
                
                if(i != n)
                {
                    totalTime += Math.ceil(dist[i] / (double)mid)  ;
                    
                }
                else
                {
                    totalTime += dist[i] / (double)mid ;
                    
                }
            }
            if(totalTime <=  hour)
            {
                ans = mid  ;
                high = mid - 1;

            }

            else
            {
                low = mid + 1 ;
            }
        }
        return ans ;
        
    }
}