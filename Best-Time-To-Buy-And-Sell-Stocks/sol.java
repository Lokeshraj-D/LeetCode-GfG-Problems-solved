class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min_element = prices[0];

        for(int ele : prices){
            if (ele<min_element)
                min_element = ele;
            else
                ans = Math.max(ans, ele-min_element);
        }

        return ans;
    }
}
