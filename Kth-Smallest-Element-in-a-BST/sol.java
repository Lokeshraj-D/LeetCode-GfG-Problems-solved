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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();

        while(root!=null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                root = root.left;
            }

            TreeNode temp = st.pop();
            if(--k==0)
                return temp.val;
            root = temp.right;
        } 

        return -1;
    }
}
