public class lab5 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
   
     }

     public boolean isValidBST(TreeNode root) {
        /*if (root == null ) return true;
        TreeNode curr = root;
        if (curr.left.val > curr.val ){
            return false;
        }
        else if ( curr.right.val < curr.val ){
            return false;
        }
        else{
            return true;
        }
        return isValidBST(curr.left) && isValidBST(curr.right); */

        if (root == null ) return true;
        ///min max helper function when looing at subtrees?
        //uupper bound 5 (highest possible value in left subtree) vice versa
        // that means if we see a value higher thean the upper bound in the left subtree its automatically false
        //every time we look at a new subtree, update upper and lwor bounds
     }

}
