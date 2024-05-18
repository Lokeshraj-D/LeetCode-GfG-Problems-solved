class Solution {

    public void backtrack(int[] cand, int target, int start, List<List<Integer>> sol, List<Integer> arr){
        if(target==0){
            sol.add(new ArrayList<>(arr));
            return;
        }

        for(int i=start;i<cand.length;i++){
            if(cand[i]<=target){
                arr.add(cand[i]);
                backtrack(cand, target-cand[i], i, sol, arr);
                arr.remove(arr.size()-1);
            }
        }

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> sol = new ArrayList<>();
        backtrack(candidates, target, 0, sol, new ArrayList<>());
        return sol;
    }
}
