class Solution {
public:
    int trap(vector<int>& height) {
        int l = height.size();
        int left=0;
        int right=l-1;
        int max_l=0, max_r=0;
        int sol=0;
        while(left<right){
            int hl = height[left];
            int hr = height[right];
            if(hl <= hr){
                if(max_l > hl){
                    sol+=max_l-hl;
                }
                else{
                    max_l=hl;
                }
                left++;
            }
            else{
                if(max_r > hr){
                    sol+=max_r-hr;
                }
                else{
                    max_r=hr;
                }
                right--;
            }
        }
        return sol;
    }
};
