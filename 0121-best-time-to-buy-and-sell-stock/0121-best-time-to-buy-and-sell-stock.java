class Solution {
    public int maxProfit(int[] prices) {

        int buyPrice = Integer.MAX_VALUE ;
        int maxProfit = 0 ;

        for(int i = 0 ; i < prices.length ; i++) 
        {
            if(buyPrice < prices[i])
            {
                int profit =  prices[i] - buyPrice  ;//price[i]d is the selling price
                maxProfit = Math.max(profit , maxProfit) ;
            }
            else
                buyPrice = prices[i] ;
        }
        if(maxProfit == 0)
            return 0;

        else
            return maxProfit ;
        
    }
}