 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Merge_Two_Binary_Trees_617 {
    public static void main(String[] args) {

    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        //Don't think of Treenode t1 as an entire tree, think of it as the current node.
        //We have a couple cases;
        //Case1: Left node is null, return the right.
        //Case2: Right node is null, reutrn the left
        //Case3: Neither are null, add them together
        //After that, we recursively call on the rest of the tree

        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }
}
