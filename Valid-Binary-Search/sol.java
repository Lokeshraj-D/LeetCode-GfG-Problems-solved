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

    public List<Integer> inorder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root==null)
            return list;

        while(root!=null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                root = root.left;
            }

            TreeNode temp = st.pop();
            list.add(temp.val);
            root = temp.right;
        }

        return list;
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = inorder(root);

        for(int i=1;i<list.size();i++){
            if(list.get(i) <= list.get(i-1))
                return false;
        }
        return true;
    }
}
