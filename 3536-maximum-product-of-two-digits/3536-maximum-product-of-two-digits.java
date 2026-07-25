class Solution {
    public int maxProduct(int n) {

        int max1 = Integer.MIN_VALUE ;
        int max2 = max1 ;

        //ArrayList <Integer> arr = new ArrayList<>();
        while(n != 0)
        {
            int dig = n % 10;

            if(dig >= max1)
            {
                max2 = max1 ;
                max1 = dig ;
            }
            if(dig > max2 && dig != max1)
                max2 = dig ;
            // arr.add(dig) ;
            n = n/10 ;
        }
        

        // for(int i = 0 ; i < arr.size() ; i++)
        // {
        //     if(arr.get(i) >=  max1)
        //     {
        //         max2 = max1 ;
        //         max1 = arr.get(i) ;
        //     }
        //     if(arr.get(i) > max2 && arr.get(i) != max1)
        //         max2 = arr.get(i) ;
        // }
        return max1 * max2 ;
        
    }
}