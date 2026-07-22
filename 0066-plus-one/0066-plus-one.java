class Solution {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1 ; i >= 0 ; i-- )
        {
            if(digits[i] < 9)
            {
                digits[i]++ ;
                return digits ;
            }

            digits[i] = 0 ; // only get executed when ith element is 9 the make it zero
        }

        //if all are 9
        int ans [] = new int [digits.length + 1] ;
        ans[0] = 1 ; // 999 + 1 gives 1000 so just make first element one bcz array dflt vallue iis 0
        return ans ;
        
    }
}