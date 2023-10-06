class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = numbers.length;
        int i=0;
        int j=l-1;
        int sum=numbers[i]+numbers[j];
        while(sum!=target){
            if(sum>target)
                j--;
            else
                i++;
            sum = numbers[i]+numbers[j];
        }
        int[] lis={i+1, j+1};
        return lis;
    }
}
