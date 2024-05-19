class Solution {

    public void backtrack(String digits, int ind, List<String> sol, String s){
        if(ind==digits.length()){
            sol.add(s);
            return;
        }

        int val = Integer.parseInt(digits.substring(ind, ind+1));
        int start=0, end_ind=3;
        if(val<7)
            start = 97+(val-2)*3;
        else if(val==7){
            end_ind=4;
            start = 112;
        }
        else if(val==8)
            start = 116;
        else{
            end_ind = 4;
            start = 119;
        }
        for(int i=0;i<end_ind;i++){
            backtrack(digits, ind+1, sol, s+Character.toString((char)(start+i)));
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> sol = new ArrayList<>();
        if(digits.length()==0)
            return sol;


        backtrack(digits, 0, sol, new String());
        return sol;
    }
}
