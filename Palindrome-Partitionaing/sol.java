class Solution {

    public boolean isPalindrome(String s, int low,int high){

        while(low<high){
            if(s.charAt(low)!=s.charAt(high))
                return false;

            low++;
            high--;
        }
        return true;
    }

    public void backtrack(String s, List<List<String>> sol, List<String> arr, int start){
        if(s.length()==start){
            sol.add(new ArrayList<>(arr));
            return;
        }

        for(int end=start;end<s.length();end++){
            if(!isPalindrome(s, start, end)) continue;

            arr.add(s.substring(start, end+1));
            backtrack(s, sol, arr, end+1);
            arr.remove(arr.size()-1);
        }
    }


    public List<List<String>> partition(String s) {
        List<List<String>> sol = new ArrayList<>();

        backtrack(s, sol, new ArrayList<>(), 0);
        return sol;
    }
}
