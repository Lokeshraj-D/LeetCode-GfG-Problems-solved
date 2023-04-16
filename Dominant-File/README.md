###DOMINANT PAIRS

You are given an array of integers of size n where n being even.. You have to calculate the number of dominate pairs (i,j) . Where a pair is called dominant if ( 0<=i<n/2, n/2<=j<n, arr[i]>=5*arr[j] ) these relation are fulfilled.  For example  in arr=[10,3,3,1] index i=0, j=3 form a dominating pair

Note : 0 based indexing is used  and n is even 

Example 1:
```
Input:
n=4
arr={10,2,2,1}
Output:
2
Explanation:
As we can see index i=0 and j=2 where
arr[0]>=5*arr[2] (10>=5*2)is fulfilled so
this forms a dominant pair and in same
manner index i=0 and j=3 forms dominant
pair.So total 2 dominant pairs.
```

Example 2:
```
Input:
n=6
arr={10,8,2,1,1,2}
Output:
5
Explanation:
As we can see index i=0 and j=3 where
arr[0]>=5*arr[3] (10>=5*1) is fulfilled so
this forms a dominant pair and in same
manner (0,4),(0,5),(1,3),(1,4) also form
dominant pair.So total 5 dominant pairs.
```
