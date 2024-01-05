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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode head = new ListNode(0);
        ListNode ptr = head;
        int c=0;

        while(ptr1!=null || ptr2!=null){
            int v1 = ptr1==null ? 0 : ptr1.val;
            int v2 = ptr2==null ? 0 : ptr2.val;
            int v = v1+v2+c;
            c = v/10;
            v=v%10;
            ptr.next = new ListNode(v);
            ptr = ptr.next;

            ptr1 = ptr1==null ? null : ptr1.next;
            ptr2 = ptr2==null ? null : ptr2.next;
        }

        if(c!=0)
            ptr.next = new ListNode(c);

        return head.next;
    }
}
