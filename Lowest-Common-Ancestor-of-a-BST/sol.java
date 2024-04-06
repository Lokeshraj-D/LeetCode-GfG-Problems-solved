/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while((root.val-(long)p.val)*(root.val-(long)q.val)>0){
            if(root.val < p.val) 
                return lowestCommonAncestor(root.right, p, q);
            else
                return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}
