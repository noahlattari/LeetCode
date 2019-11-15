public class Is_Valid_BST_98 {
    public boolean isValidBST(TreeNode root) {
        //have 2 variables, a min and max.
        //when recursing on the left, everything msut be smaller than root
        //when recursing on the right, everything on the right must be bigger
        if(root == null) return true;

        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    private boolean isValidBST(TreeNode root, long min, long max){
        if(root == null) return true;

        //root is less than min, or more than max
        if(root.val <= min || root.val >= max){
            return false;
        }

        //when you go left, root is your max, when you go right, root is your min
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}
