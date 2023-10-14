class Solution {
    Node head;
    public int evalRPN(String[] tokens) {
        for(String ele:tokens){
            if(ele.equals("+")){
                int sum = head.val + head.next.val;
                //System.out.println(head.val + "+" + head.next.val);
                head = head.next;
                head.val = sum;
            }
            else if(ele.equals("-")){
                int sub = head.next.val - head.val;
                //System.out.println(head.val + "-" + head.next.val);
                head = head.next;
                head.val = sub;
            }
            else if(ele.equals("*")){
                int mul = head.val*head.next.val;
                //System.out.println(head.val + "*" + head.next.val);
                head = head.next;
                head.val = mul;
            }
            else if(ele.equals("/")){
                int div = head.next.val/head.val;
                //System.out.println(head.val + "/" + head.next.val);
                head = head.next;
                head.val = div;
            }
            else{
                head = new Node(Integer.parseInt(ele),head);
            }
        }
        return head.val;
    }

    private class Node{
        int val;
        Node next;
        private Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }
}
