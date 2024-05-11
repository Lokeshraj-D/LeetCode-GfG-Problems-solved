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

    public int max = -9999;

    public int solution(TreeNode root){
        if(root==null)
            return 0;

        int sum = root.val;
        int left=solution(root.left);
        int right=solution(root.right);

        sum+=left+right;
        int maxSide = Math.max(left, right);
        int maxOneSide = Math.max(root.val, root.val+maxSide);
        int maxAll = Math.max(maxOneSide, root.val+left+right);

        max = Math.max(max, maxAll);

        return maxOneSide;


    }

    public int maxPathSum(TreeNode root) {
        solution(root);
        return max;
    }
}
