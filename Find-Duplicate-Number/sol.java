class Solution {
    public int findDuplicate(int[] nums) {
        int l = nums.length-1;
        boolean[] arr = new boolean[l];
        Arrays.fill(arr, false);

        for(int e:nums){
            if(arr[e-1])
                return e;
            arr[e-1] = true;
        }
        return 0;
    }
}
