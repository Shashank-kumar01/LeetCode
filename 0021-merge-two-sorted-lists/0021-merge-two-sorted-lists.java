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

        //this approch is by creting a new LL
        ListNode temp1 = list1 ;
        ListNode temp2 = list2 ;
        ListNode temp = new ListNode(100) ;
        ListNode head = temp;

        while(temp1 != null && temp2 != null)
        {
            if(temp1.val < temp2.val)
            {
                ListNode a = new ListNode(temp1.val) ;
                temp.next = a ; 
                temp = a ;
                temp1 = temp1.next ;
            }
            else
            {
                ListNode a = new ListNode(temp2.val) ;
                temp.next = a ; 
                temp = a ;
                temp2 = temp2.next ;
            }
        }
        if(temp1 == null) //if LL1 fnshd bfr LL2 thn all vlues of LL1 r cn3ctd with LL2 
            temp.next = temp2 ;

        else //if LL22 fnshd bfr LL1 thn all vlues of LL2 r cn3ctd with LL1
            temp.next = temp1 ;

        head = head.next ; // head had a value 100 in first node so return the rest excpt this node
        return head ;
    }
}