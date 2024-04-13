# [COUNT GOOD NODES IN BINARY TREE](https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/)

### Difficulty: ***Medium***


Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.

Return the number of good nodes in the binary tree.

![image](https://github.com/Lokeshraj-D/LeetCode-GfG-Problems-solved/assets/95064682/0433e188-fce3-4c2c-bf68-f51ade8954cc)

```
Example 1:

Input: root = [3,1,4,3,null,1,5]
Output: 4
Explanation: Nodes in blue are good.
Root Node (3) is always a good node.
Node 4 -> (3,4) is the maximum value in the path starting from the root.
Node 5 -> (3,4,5) is the maximum value in the path
Node 3 -> (3,1,3) is the maximum value in the path.
```
```
Example 2:

Input: root = [1]
Output: 1
Explanation: Root is considered as good.
```

