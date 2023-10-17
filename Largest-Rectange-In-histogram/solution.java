class Solution {

    public int largestRectangleArea(int[] heights) {
        if(heights.length==1)
            return heights[0];
        int l = heights.length;
        int leftlowest[] = new int[l];
        int rightlowest[] = new int[l];
        leftlowest[0]=-1;
        rightlowest[l-1]=l;

        for(int i=1;i<l;i++){
            int j = i-1;
            while(j>=0 && heights[j]>=heights[i])
                j = leftlowest[j];

            leftlowest[i] = j;
        }
        
        for(int i=l-2;i>=0;i--){
            int j = i+1;
            while(j<l && heights[j]>=heights[i])
                j = rightlowest[j];

            rightlowest[i] = j;
        }

        int ans=0;
        for(int i=0;i<l;i++){
            ans = Math.max(ans, (rightlowest[i]-leftlowest[i]-1)*heights[i]);
        }
        return ans;
    }
}
