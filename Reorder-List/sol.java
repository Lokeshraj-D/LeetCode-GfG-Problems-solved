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

    public ListNode reverseList(ListNode head){
        ListNode ptr = null;
        while(head!=null){
            ListNode p = new ListNode(head.val, ptr);
            ptr=p;
            head=head.next;
        }
        return ptr;
    }

    public void reorderList(ListNode head) {
        int l = 1;
        ListNode ptr = head;
        while(ptr!=null){
            l++;
            ptr=ptr.next;
        }

        if(l<3)
            return;
        ptr=head;
        int m=l/2;
        int c=0;
        while(++c<m)
            ptr=ptr.next;
        

        ListNode ptr1 = reverseList(ptr.next);
        ptr.next=null;

        ptr=head;
        while(ptr1!=null){
            ListNode p = new ListNode(ptr1.val, ptr.next);
            ptr.next=p;
            ptr=p.next;
            ptr1=ptr1.next;
        }
    }
}
