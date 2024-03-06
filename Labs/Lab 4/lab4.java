public class lab4 {
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

    public TreeNode invertTree(TreeNode root) {
        /* if (root == null) return null;
        TreeNode curr = root;
        TreeNode temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;
        root.left = invertTree(root.right);
        root.right = invertTree(root.left);
        return root; */

        /*
         public class Solution {
        public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
            TreeNode tmp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(tmp);
            return root;
        }}
         */

         if(root == null) return null; //can't check children if it doesn texist, if we do recursion we shd check base case
         // redundant if statement? 
         //if (root.right ==null && root.left == null) return root; //leaf node
         if(root.left != null){
            root.left = invertTree(root.left);
         }
         if(root.right != null){
            root.right = invertTree(root.right);
         }
         TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            return root;
        }
    }
}
