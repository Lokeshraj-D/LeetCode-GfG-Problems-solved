
class Node{
    int x;
    int y;
    int dist;

    Node(int x, int y, int dist){
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.dist));

        int l = 0;
        for(int[] ele:points){
            int x=ele[0], y=ele[1];
            if(l==k){
                int dist = -1*(x*x+y*y);
                if(pq.peek().dist < dist){
                    pq.poll();
                    Node temp = new Node(x, y, dist);
                    pq.add(temp);
                }
                else
                    continue;
            }
            l++;
            Node temp = new Node(x, y, -1*(x*x+y*y));
            pq.add(temp);
        }

        int[][] sol = new int[k][2];

        int i=0;
        while(!pq.isEmpty() && i<k){
            Node temp = pq.poll();
            sol[i][0] = temp.x;
            sol[i][1] = temp.y; 
            i++;
        }

        return sol;
    }
}
