/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
            return new String();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        String data = new String();

        while(!q.isEmpty()){
            int l = q.size();
            while(l-->0){
                TreeNode temp = q.poll();
                if(temp==null){
                    data+="null,";
                    continue;
                }
                data+=Integer.toString(temp.val) + ",";
                //if(temp.left!=null)
                    q.add(temp.left);
                //if(temp.right!=null)
                    q.add(temp.right);
            }
        }

        System.out.println(data);
        return data;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals(""))
            return null;
        String[] arr = data.split(",");

        int l = arr.length;
        TreeNode head = new TreeNode(Integer.parseInt(arr[0]));
        TreeNode ptr = head;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(head);

        int i=0;
        while(i<l-1){
            ptr = q.poll();
            if(!arr[++i].equals("null")){
                ptr.left=new TreeNode(Integer.parseInt(arr[i]));
                q.add(ptr.left);
            }
            if(!arr[++i].equals("null")){
                ptr.right=new TreeNode(Integer.parseInt(arr[i]));
                q.add(ptr.right);
            }
        }
        return head;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
