/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;

        Map<Node, Integer> map = new HashMap<>();

        Node ptr = head;
        int i=0;
        while(ptr!=null){
            map.put(ptr,i);
            i++;
            ptr = ptr.next;
        }

        ptr = head;
        Node head2 = new Node(ptr.val);
        Node ptr2 = head2;
        Node[] arr = new Node[i];
        ptr=ptr.next;
        i=0;
        arr[i]=ptr2;
        while(ptr!=null){
            Node p = new Node(ptr.val);
            ptr2.next = p;
            ptr2 = ptr2.next;
            arr[++i]=ptr2;
            ptr = ptr.next;
        }

        ptr2=head2;
        ptr=head;

        while(ptr!=null){
            Node p = ptr.random;
            if(p==null)
                ptr2.random=null;
            else
                ptr2.random = arr[map.get(p)];
            
            ptr = ptr.next;
            ptr2 = ptr2.next;
        }

        return head2;
    }
}
