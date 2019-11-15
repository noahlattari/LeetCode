import java.util.*;
public class Binary_Tree_Level_Order_Traversal_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;

        Queue<TreeNode> qu = new LinkedList<>();

        qu.add(root);
        while(!qu.isEmpty()){
            List<Integer> curr = new ArrayList<Integer>();
            int n = qu.size();
            //loop through every node on the level
            for(int i = 0; i < n; i++){
                TreeNode current = qu.remove();
                curr.add(current.val);
                if(current.left != null){
                    qu.add(current.left);
                }
                if(current.right != null){
                    qu.add(current.right);
                }
            }
            res.add(curr);
        }

        return res;

    }
}
