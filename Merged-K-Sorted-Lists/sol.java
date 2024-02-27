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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists == null)  
            return null;

        List<ListNode> list = new ArrayList<>(Arrays.asList(lists));
        
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(list.size(), new Comparator<ListNode>(){
            @Override
            public int compare(ListNode l1, ListNode l2){
                if(l1.val < l2.val)
                    return -1;
                else if(l1.val==l2.val)
                    return 0;
                else
                    return 1;
            }
        });

        for(ListNode ele:list){
            if(ele!=null)
                pq.add(ele);
        }

        ListNode head = new ListNode();
        ListNode ptr = head;

        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            ptr.next = new ListNode(temp.val);
            ptr = ptr.next;
            
            if(temp.next!=null)
                pq.add(temp.next);
        }

        return head.next;
    }
}
