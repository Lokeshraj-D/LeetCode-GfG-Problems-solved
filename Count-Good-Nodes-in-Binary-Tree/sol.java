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
    public int goodNodes_count = 0;

    public void findCount(TreeNode root, int max_root){
        if(root==null)
            return;

        if(root.val>=max_root){
            goodNodes_count++;
            max_root=root.val;
        }

        if(root.left!=null)
            findCount(root.left, max_root);
        if(root.right!=null)
            findCount(root.right, max_root);

    }


    public int goodNodes(TreeNode root) {
        findCount(root, root.val);
        return goodNodes_count;
    }
}

//Time: 1ms, 100%
