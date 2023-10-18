# [SEARCH A 2D MATRIX](https://leetcode.com/problems/search-a-2d-matrix/)

### Difficulty: ***Medium***

You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

![image](https://github.com/Lokeshraj-D/LeetCode-GfG-Problems-solved/assets/95064682/f4b22370-3153-4d1e-9c7b-05af14041dc8)

```
Example 1:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
```

![image](https://github.com/Lokeshraj-D/LeetCode-GfG-Problems-solved/assets/95064682/17e3eaca-5115-4a4e-8ebc-6ddc7615b8ad)

```
Example 2:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
```
Time Complexity: O(nlogn)
