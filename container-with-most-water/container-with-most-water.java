class Solution {
    public int maxArea(int[] height) {
        if(height.length==2)
            return Math.min(height[0],height[1]);
        
        int i=0;
        int max=0;
        int j=height.length-1;
        while(i<j){
            int h = Math.min(height[i], height[j]);
            max = Math.max(max,h*(j-i));
            while(height[i]<=h && i<j) i++;
            while(height[j]<=h && i<j) j--;
        }
        return max;
    }
}
