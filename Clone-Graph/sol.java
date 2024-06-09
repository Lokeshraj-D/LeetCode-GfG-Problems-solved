/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Node[] visited = new Node[101];

    public Node cloneGraph(Node node) {
        if(node==null)
            return null;

        for(int i=0; i<=100; i++)
            visited[i] = null;

        Stack<Node> st = new Stack<>();
        st.push(node);

        while(!st.isEmpty()){
            Node n = st.pop();
            Node root;
            if(visited[n.val]==null){
                root = new Node(n.val);
                visited[n.val] = root;
            }
            else
                root = visited[n.val];

            List<Node> newneigh = new ArrayList<>();
            for(Node nodes: n.neighbors){
                Node temp;
                if(nodes==null)
                    continue;
                if(visited[nodes.val]==null){
                    temp = new Node(nodes.val);
                    visited[nodes.val] = temp;
                    st.push(nodes);
                }
                else
                    temp = visited[nodes.val];
                newneigh.add(temp);
            }
            root.neighbors = newneigh;
        }

        return visited[1];
    }
}
