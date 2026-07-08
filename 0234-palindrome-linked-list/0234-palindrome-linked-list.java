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
    public boolean isPalindrome(ListNode head) {

        //if list contains only one element or no element
        if(head == null && head.next == null)
            return true ;
            
        // finding middle element
        ListNode slow = head;
        ListNode fast = head ;

        while(fast != null && fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
        }
        //reverse the ssecond half

        ListNode prev = null ;
        ListNode curr = slow ;

        while(curr != null)
        {
            ListNode aftr = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = aftr ;
        }
        //compare voth halves

        ListNode first = head ;
        ListNode second = prev ;

        while(second != null)
        {
            if(first.val != second.val)
                return false ;
            
            first = first.next ;
            second = second.next ;
        }
        return true ;
    }
}