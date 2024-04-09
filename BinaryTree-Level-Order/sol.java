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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)
            return list;
            
        int lvl_c=1;
        while(!q.isEmpty()){
            int i=lvl_c;
            lvl_c=0;
            List<Integer> l = new ArrayList<>();
            while(i-->0){
                TreeNode temp = q.poll();
                l.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                    lvl_c++;
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    lvl_c++;
                }
            }
            list.add(l);
        }

        return list;
    }
}

//runtime : 1ms,beats 88%
//memory: 45mb, beats 50%
