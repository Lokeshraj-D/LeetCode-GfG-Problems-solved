class Solution {

    public boolean isValid(String s, int ind, int n){
        int val = s.charAt(ind) - '0';
        int prev = s.charAt(ind-1) - '0';

        if(val==0 || (ind+1<n && s.charAt(ind+1)=='0'))
            return false;
        

        if(prev*10+val>10 && prev*10+val<=26)
            return true;
        

        return false;
    }

    public int numDecodings(String s) {
        if(s.charAt(0)=='0')
            return 0;

        int n = s.length();

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1];
            int val = (int)(s.charAt(i-2)-'0');
            if(s.charAt(i-1)=='0' &&  (val> 2 || val==0))
                return 0;
            if(isValid(s, i-1, n)){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}
