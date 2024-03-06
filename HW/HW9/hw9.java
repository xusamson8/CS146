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
        if (root == null || root == p || root == q) return root;

        TreeNode curr = root;

        while(curr != null){
            if ( p.val > curr.val && q.val > curr.val ){
                curr = curr.right;
            }
            else if( p,val < curr.val && q.val < curr.val){
                curr = curr.left;
            }
            else{
                return curr;
            }
        }
    }

    public static void main(String[] args) {
        

    }
}
