class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int k = s1.length() ;

        if(k > s2.length())
            return false ;

        int count1 [] = new int [26] ;
        int count2 [] = new int [26] ;

        //count characers of s1
        for(int i = 0 ; i < k ; i++)
            count1[s1.charAt(i) - 'a']++ ;

        //first windpow of s2
        for(int i = 0 ; i < k ; i++)
        {
            count2[s2.charAt(i) - 'a']++ ;
        }
        if(Arrays.equals(count1 , count2))
            return true ;

        //slide window
        int j = 0 ;
        for(int i = k ; i < s2.length() ; i++)
        {
            //add new element
            count2[s2.charAt(i) - 'a']++ ;

            //remove old char
            count2[s2.charAt(j) - 'a']-- ;
            j++ ;

            if(Arrays.equals(count1 , count2))
                return true ;
        }
        return false ;
    }
}