class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1 && nums[0]==0)
            return true;

        int l = nums.length;
        for(int i=0; i<l; i++){
            if(nums[i]==0){
                int j=i-1;
                int c=1;
                boolean flag = true;
                while(j>=0){
                    if(nums[j]>c || (i==l-1 && nums[j]==c)){
                        flag = false;
                        break;
                    }
                    j--;
                    c++;
                }
                if(flag)
                    return false;
            }
        }

        return true;
    }
}
