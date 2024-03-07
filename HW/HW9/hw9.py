class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
        #python definiiton for treenodes
         self.val = val
         self.left = left
         self.right = right

class hw9:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if not root:
            return None #edge case if it doesnt exist

        if root == p or root == q:
            return root #if the root is equal to p or q, return it , root can be LCA of itself, returns itself
        
        #  look in left and right child if those cases are not true
        left = right = None #initialiazing to nothing first
        if root.left:
            left = self.lowestCommonAncestor(root.left, p, q) #recursively searching the left intil a vaue is foumd
        if root.right:
            right = self.lowestCommonAncestor(root.right, p, q)

        # if both children returned a node, it means both p and q have been found so its parent is the LCA
        if left and right:
            return root
        else:
        # otherwise, only one of the chidren returned a node, meaning either p or q are found on left or right branch. 
        # in this case where the node was found it would be the LCA
            return left or right 

# instantiation of hw9 class
tree = hw9()

# given test case and tree, construction of tree
node1 = TreeNode(1)
node3 = TreeNode(3, left=node1)  # Node 3 has left child node 1
node5 = TreeNode(5)
node9 = TreeNode(9)
node8 = TreeNode(8, left=node5, right=node9)  
root = TreeNode(4, left=node3, right=node8)  

#testing methods
LCA1 = tree.lowestCommonAncestor(root, node3, node1)  # ecpected node 3
LCA2 = tree.lowestCommonAncestor(root, node1, node5)  # ecpected node 4

# Printing values of results, have to do this orthewise it will print "0x100d7ef90>" which is probbaly the node itself
print(LCA1.val if LCA1 else None)  # Expected to print 4 
print(LCA2.val if LCA2 else None)  # Expected to print 3