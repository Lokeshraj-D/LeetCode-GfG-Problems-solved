class Solution {

    public void subsets(int[] nums, int start, List<List<Integer>> sol, List<Integer> arr){
        sol.add(new ArrayList<>(arr));

        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1])
                continue;
            arr.add(nums[i]);
            subsets(nums, i + 1, sol, arr);
            arr.remove(arr.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        Arrays.sort(nums);
        subsets(nums, 0, sol, new ArrayList<>());
        return sol;
    }
}
