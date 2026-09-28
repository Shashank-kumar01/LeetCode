class Solution {
    public int maxDepth(String s) {
        
        int currDepth = 0 , maxxDepth = 0 ;

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                currDepth++ ;
                maxxDepth = Math.max(currDepth , maxxDepth) ;
            }
            else if(ch == ')')
            {
                currDepth-- ;
            }
        }
        return maxxDepth ;
    }
}