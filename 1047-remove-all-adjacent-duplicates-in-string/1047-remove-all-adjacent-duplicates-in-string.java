class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st = new Stack<>() ;

        StringBuilder sb  = new StringBuilder() ;

        for(int i = 0 ; i < s.length() ; i++)
        {
            if(st.isEmpty())

                st.push(s.charAt(i));

            else
            {
                if(s.charAt(i) == st.peek())
                    st.pop();

                else
                {
                    st.push(s.charAt(i));
                }
            }
        }
        for(var ch : st)
        {
            sb.append(ch);
        }

        return sb.toString();
    }
}