import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class hw10 {
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

     public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> ans = new ArrayList<>();
       if (root == null) {return ans;}

       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root);

       while(!queue.isEmpty()){
        //while loop that runs when the queue isn't empty, this pops and adds values to the queue until queue is empty , that is when we are done and return answer
            List<Integer> level = new ArrayList<>();
            int len = queue.size();
            for( int i = 0 ; i < len; i++){
                TreeNode node = queue.poll();
                //poll: Retrieves and removes the head of this queue, or returns null if this queue is empty.
                level.add(node.val);
                //adds the value to level arraylist
                if(node.left!= null){
                    queue.add(node.left);
                    //if the nodes are not null, then add the childs of the node to the queue
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            ans.add(level);
            //adds level arraylist to answer list
       }
       return ans;
    }


}
