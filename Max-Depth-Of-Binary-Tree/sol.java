/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int max_dep = 0;
    public void maxDepth(TreeNode root, int curr_lvl){
        if(root==null)
            return;

        if(curr_lvl>max_dep)
            max_dep = curr_lvl;

        int left_len=0, right_len=0;
        if(root.left!=null)
            maxDepth(root.left, curr_lvl+1);
        if(root.right!=null)
            maxDepth(root.right, curr_lvl+1);

    }

    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;

        maxDepth(root, 1);
        return max_dep;
    }
}

//runtime: 0ms, beats 100%
//Memory: 42.42mb, beats 58.22%
