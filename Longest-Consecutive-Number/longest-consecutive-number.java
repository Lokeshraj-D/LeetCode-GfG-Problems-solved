class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans=0;

        for(int ele:nums){
            if(map.containsKey(ele))
                continue;
            int l = (map.containsKey(ele-1)) ? map.get(ele-1) : 0;
            int r = (map.containsKey(ele+1)) ? map.get(ele+1) : 0;
            int sum=l+1+r;
            map.put(ele, sum);

            ans=Math.max(ans, sum);

            map.put(ele-l, sum);
            map.put(ele+r, sum);
        }

        return ans;
    }
}
