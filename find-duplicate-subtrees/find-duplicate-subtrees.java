/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<String, Integer> map;
    List<TreeNode> res;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map = new HashMap<>();
        res = new ArrayList<>();
        dfs(root);
        
        return res;
    }
    
    public String dfs(TreeNode root){
        if(root == null) return "#";
       
        String subTree = root.val + "," + dfs(root.left) + "," + dfs(root.right);
       
        map.put(subTree, map.getOrDefault(subTree, 0)+1);
       
        if(map.get(subTree) == 2){
            res.add(root);
        }
        return subTree;
    }
}
