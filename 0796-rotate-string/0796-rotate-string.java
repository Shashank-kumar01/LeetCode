class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length())
            return false ;

        return(s + s).contains(goal) ; //return true if s+s contains goal else false

        //if s+ abcde,  goal = cdeab
        //s+s means abcdeabcde ....now s+s must contain goal otherwise false
    }
}