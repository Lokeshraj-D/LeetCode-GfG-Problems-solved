class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele:stones)
            pq.add(-1*ele);
        
        while(!pq.isEmpty()){
            int w1 = pq.poll();
            if(pq.isEmpty())
                return -1*w1;
            
            int w2 = pq.poll();
            if(w1==w2)
                continue;
            pq.add(-1*Math.abs(w1-w2));
        }
        return 0;
    }
}
