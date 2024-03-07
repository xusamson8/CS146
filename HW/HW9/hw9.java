package HW.HW9;

public class hw9 {
    public class TreeNode { //java definition for treenodes
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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        
        if(root == p || root == q) //returns root value if equal to p or q, root can be LCA of itself
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q); //recursively searches the left subtree, finding p or q or null
        TreeNode right = lowestCommonAncestor(root.right, p, q); //"" but for right subtree

         if(left == null) {
            return right;
        }
        else if(right == null) {
            return left;
        }
        else { //both left and right are not null, we found our result
            return root;
        }
    }

    public static void main(String[] args) {
        

    }
}
