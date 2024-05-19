class Solution {

    public void permutations(int[] nums, int start, List<List<Integer>> sol, List<Integer> arr){
        if(start==nums.length){
            sol.add(new ArrayList<>(arr));
            return;
        }

        for(int i=start;i<nums.length;i++){        
            int temp = nums[i];
            nums[i] = nums[start];
            nums[start] = temp;
            arr.add(temp);
            permutations(nums, start+1, sol, arr);
            nums[start] = nums[i];
            nums[i] = temp;
            arr.remove(arr.size()-1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        permutations(nums, 0, sol, new ArrayList<>());
        return sol;
    }
}
