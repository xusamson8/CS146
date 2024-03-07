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
        if(root == null) //if the root is null we cant find the lca
            return null;
        
        if(root == p || root == q) //returns root value if equal to p or q, root can be LCA of itself
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q); //recursively searches the left subtree, finding p or q or null
        TreeNode right = lowestCommonAncestor(root.right, p, q); //"" but for right subtree

         if(left == null) { //if we didn't find any value on the left (it is null), then we return what we have, and it would be the LCA
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
        hw9 tree = new hw9();

        // creating binary tree
        TreeNode root = tree.new TreeNode(4);
        TreeNode n3 = tree.new TreeNode(3);
        TreeNode n8 = tree.new TreeNode(8);
        TreeNode n1 = tree.new TreeNode(1);
        TreeNode n5 = tree.new TreeNode(5);
        TreeNode n9 = tree.new TreeNode(9);

        root.left = n3;
        root.right = n8;
        n3.left = n1;
        n8.left = n5;
        n8.right = n9;

        // 1st test
        TreeNode p = n1;
        TreeNode q = n5;
        TreeNode lca = tree.lowestCommonAncestor(root, p, q);
        System.out.println("lca of 1 and 5: "+ lca.val); // Expected: 4

        // 2nd test 
        p = n3;
        q = n1;
        lca = tree.lowestCommonAncestor(root, p, q);
        System.out.println("lca of 1 and 3: "+ lca.val); // Expected: 3

    }
}
