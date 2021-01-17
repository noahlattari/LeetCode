/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
​
        Queue<TreeNode> qu = new LinkedList<>();
​
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
​
        return res;
​
    }
}
