/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //this solution uses inplace approach without create new LL

        ListNode temp1 = list1 ;
        ListNode temp2 = list2 ;
        ListNode h = new ListNode(100) ;
        ListNode t = h ;

        while(temp1 != null && temp2 != null)
        {
            if(temp1.val < temp2.val)
            {
                t.next = temp1;
                t = t.next ;
                temp1 = temp1.next;
            }
            else
            {
                t.next = temp2;
                t = t.next ;
                temp2 = temp2.next;
            }
        }

        if(temp1 == null)
            t.next = temp2 ;

        else
            t.next = temp1 ;

        return h.next ;
        
    }
}