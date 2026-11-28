class Solution {
    public int thirdMax(int[] nums) {

        long firstDist = Long.MIN_VALUE ;
        long scndDist = Long.MIN_VALUE ;
        long thirdDist = Long.MIN_VALUE ;

        for(int num : nums)
        {
            if(num == firstDist || num == scndDist || num == thirdDist)
                continue ;

            if(num > firstDist)
            {
                thirdDist = scndDist ;
                scndDist = firstDist ;
                firstDist = num ;
            }
            else if(num > scndDist)
            {
                thirdDist = scndDist ;
                scndDist = num ;
            }

            else if(num > thirdDist)
                thirdDist = num ;
        }

        if(thirdDist == Long.MIN_VALUE )
            return (int)firstDist ;

        else
            return (int)thirdDist ;
        
    }
}