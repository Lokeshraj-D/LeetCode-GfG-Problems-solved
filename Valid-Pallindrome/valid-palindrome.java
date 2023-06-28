class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        char c[]=s.toCharArray();
        int l=s.length();
        for(int i=0;i<l/2;i++)
            if(c[i] != c[l-i-1])
                return false;
        
        return true;
    }
}
