class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0)
            return "" ;

        Arrays.sort(strs) ;

        int n = strs.length - 1 ;
        String first = strs[0] ;
        String last = strs[n];

        int i = 0 ;

        String ans = "";

        while(i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i))
        {
            ans += first.charAt(i) ;
            i++ ;
            
        }
        return ans ;
        
    }
}