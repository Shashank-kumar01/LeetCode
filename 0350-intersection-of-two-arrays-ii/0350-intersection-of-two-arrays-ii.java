class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap <Integer , Integer> map = new HashMap<>() ;
        
        for(int i = 0 ; i < nums1.length ; i++)
        {
            
            
                map.put(nums1[i] , map.getOrDefault(nums1[i] , 0)+1);
            
              
        }
        
         ArrayList <Integer> list = new ArrayList <>() ;
        
        for(int num :nums2)
        {
            if(map.containsKey(num) && map.get(num) > 0)
            {
                list.add(num) ;
                map.put(num , map.get(num) - 1) ;
            }
        }
        
        int ans [] = new int [list.size()] ;
        
        for(int i = 0 ; i < list.size() ; i++)
        {
            ans[i] = list.get(i);
        }
            
        
        
        return ans ;
        
    }
}