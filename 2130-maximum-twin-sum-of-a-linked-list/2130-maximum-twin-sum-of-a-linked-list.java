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
    public int pairSum(ListNode head) {
        
        //find middle element
        ListNode slow = head ;
        ListNode fast = head ;

        while(fast != null && fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
        }

        //reverse from middle 
        ListNode  prev = null ;
        ListNode curr = slow ;

        while(curr != null)
        {
            ListNode aftr = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = aftr ;
        }
        //find sum from frst element of both half

        int sum = 0;
        int maxSum = sum ;
        ListNode first = head ;
        ListNode second = prev ;

        while(second != null)
        {
            sum = first.val + second.val ;
            maxSum = Math.max(sum , maxSum);

            first = first.next ;
            second = second.next ;
        }
        return maxSum;
    }
}