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
    public ListNode reverseNode(ListNode ptr1, ListNode ptr2){
        ListNode ptr = ptr1;
        ListNode head = new ListNode(ptr.val, ptr2);
        ptr = ptr.next;

        while(ptr!=ptr2){
            ListNode p = new ListNode(ptr.val, head);
            head = p;
            ptr = ptr.next;
        }
        return head;
    }

    public void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println("\n");
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1)
            return head;

        ListNode follow = head;
        ListNode lead = head;
        int count=1;
        while(count<k){
            lead = lead.next;
            count++;
        }
        if(lead.next==null)
            return reverseNode(head, null);

        head = reverseNode(follow, lead.next);

        ListNode temp = follow.next;
        while(temp.next!=lead.next)
            temp = temp.next;

        lead = temp;
        follow = head;
        lead = lead.next;
        count=1;

        while(lead.next!=null){
            lead = lead.next;
            follow = follow.next;

            count++;
            if(count==k){
                follow.next = reverseNode(follow.next, lead.next);
                count=0;
                temp = follow.next;
                while(temp.next!=lead.next)
                    temp = temp.next;

                lead = temp;
            }
        }

        return head;


    }
}
