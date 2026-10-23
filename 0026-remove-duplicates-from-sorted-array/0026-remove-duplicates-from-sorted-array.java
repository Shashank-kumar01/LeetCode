class Solution {
    public int removeDuplicates(int[] nums) {
        
        int  j = 1 , i = 0;
        int count = 1 ;

        while(j < nums.length)
        {
            if(nums[j] == nums[j - 1])
            {
                j++ ;
            }      
            else
            {
                i++;
                nums[i] = nums[j];
                j++ ;
                count++ ;
            }
        }
        return count ;
    }
}