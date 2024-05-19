class Solution {

    public void backtrack(int[] cand, int target, int start, List<List<Integer>> sol, List<Integer> arr){
        if(target==0){
            sol.add(new ArrayList<>(arr));
            return;
        }

        for(int i=start; i<cand.length; i++){
            if(cand[i]<=target && (i==start || cand[i]!=cand[i-1])){
                arr.add(cand[i]);
                backtrack(cand, target-cand[i], i+1, sol, arr);
                arr.remove(arr.size()-1);
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> sol = new ArrayList<>();
        backtrack(candidates, target, 0, sol, new ArrayList<>());
        return sol;
    }
}
