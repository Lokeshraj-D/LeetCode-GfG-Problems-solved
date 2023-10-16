class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Double> m = new HashMap<>();
        int l = position.length;
        for(int i=0;i<l;i++){
            int pos = position[i];
            double spd = ((double)target-(double)pos)/(double)speed[i];
            m.put(-1*pos, spd);
        }
        
        Map<Integer, Double> sortedm = new TreeMap<>(m);
        int c=0;
        double max_time=0;

        for(int ele : sortedm.keySet()){
            double duration = m.get(ele);
            System.out.println(ele + ": " + duration);
            if(duration>max_time){
                c++;
                max_time = duration;
            }
        }
        return c;
    }
}
