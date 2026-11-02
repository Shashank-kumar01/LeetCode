class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length ;
        int n = nums2.length ;
        int ans [] = new int[m + n] ;

        int left = 0 , right= 0 ;
        int index = 0 ;

        while(left < m && right < n)
        {
            if(nums1[left] < nums2[right])
            {
                ans[index] = nums1[left] ;
                left++ ;
            }
            else
            {
                ans[index] = nums2[right] ;
                right++ ;
            }
            index++ ;
        }
        while(left < m)
        {
            ans[index] = nums1[left] ;
            left++ ;
            index++ ;
        }
         while(right < n)
        {
            ans[index] = nums2[right] ;
            right++ ;
            index++ ;
        }

        int x = ans.length ;

        if(x % 2 == 0 )
        {
            int mid = x / 2 ;
            double median = (ans[mid] + ans[mid - 1]) / 2.0;
            return median ;
        }
        else
        {
            int mid = x / 2;
            double median =  ans[mid] ;
            return median ;
        }
        
    }
}