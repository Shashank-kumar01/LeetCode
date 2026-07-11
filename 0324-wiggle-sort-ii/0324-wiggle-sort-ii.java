class Solution {
    public void wiggleSort(int[] nums) {
        
        int temp[] = new int[nums.length] ;
        for(int i = 0 ; i < nums.length ; i++)
            temp[i] = nums[i] ; //copying array

        Arrays.sort(temp);

        //divide array in two parts 
        int left = (nums.length - 1)/2  ; //points the end of left part of array
        int right = nums.length - 1 ; //point to the ennd of right array

        //At even indices (0, 2, 4, ...):nums[i] <= nums[i + 1]
        //so if this cond fail swap them and vice versa for odd indexs

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(i % 2 == 0)
            {
                nums[i] = temp[left--];
            }
            else
            {
                nums[i] = temp[right--] ;
            }
        }
    }
}