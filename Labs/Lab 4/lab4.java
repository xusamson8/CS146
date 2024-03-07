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
        //base case , root is null, cant invert anything , return null
        if(root == null) return null;
        //function is called recursively for left side of tree (left subtree) ,  
        invertTree(root.left);
        //"" right side of tree, likewise
        invertTree(root.right);

        //get the nodes and swap , this is where the swapping occurs, if the root isn't null 
        //keep recursively calling and swapping the subtrees/leaf, after everything is swapped 
        //it goes back to the top and swaps the subtrees completely as a last call
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root; 
        }
    
}
