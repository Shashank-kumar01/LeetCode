class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer , Integer> map = new HashMap<>() ;
        map.put(0,1) ; //It means we've seen a prefix sum of 0 once before starting. 
                    //This  helps count subarrays that begin at index 0.
        
        int prefSum = 0 ; 
        int count  = 0 ;

        for(int num : nums)
        {
            prefSum += num ;
            int need = prefSum - k ; //this gives the required num for to make the sum =target

            if(map.containsKey(need))
                count += map.get(need) ; //if found increase the count of occureence
            
            if(map.containsKey(prefSum))
                map.put(prefSum , map.get(prefSum)+1);

            else
                map.put(prefSum , 1) ;
        }
        return count ;
    }
}