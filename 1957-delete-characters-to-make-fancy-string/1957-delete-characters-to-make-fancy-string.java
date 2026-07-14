class Solution {
    public String makeFancyString(String s) {

        StringBuilder ans = new StringBuilder () ;

        if (s.length() < 3)
        {
            return s;
        }

        ans.append(s.charAt(0)) ;
        ans.append(s.charAt(1)) ;

        int i = 2 ;//bcz first two char are already inserted
        
        while(i < s.length() )
        {
            int len = ans.length() ;
            //compare the last two char in ans with the next char in s
            if((s.charAt(i) == ans.charAt(len-1)) && (s.charAt(i) == ans.charAt(len-2)))
            {
                i++ ; //if equal then skip the  curr char in s
            }
            else
            {
                ans.append(s.charAt(i)) ; // if not equal the andd it
                i++ ;
            }
        }
        return ans.toString();
    }
}