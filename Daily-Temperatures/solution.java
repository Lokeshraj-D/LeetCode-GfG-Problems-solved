class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Node head = null;
        int l = temperatures.length;
        int[] ans = new int[l];
        for(int i=l-1;i>=0;i--){
            int ele=temperatures[i];
            if(head==null){
                head = new Node(ele, 0, null);
                ans[i]=0;
                continue;
            }
            int count=0;
            while(head!=null && head.val<=ele){
                count+=head.c;
                head=head.next;
            }
            if(head==null){
                head = new Node(ele, 0, null);
                ans[i]=0;
                continue;
            }
            head = new Node(ele, ++count, head);
            ans[i]=count;
        }
        return ans;
    }

    private class Node{
        int val;
        int c;
        Node next;

        private Node(int val, int c, Node next){
            this.val = val;
            this.c = c;
            this.next = next;
        }
    }
}
