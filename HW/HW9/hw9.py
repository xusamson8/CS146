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
        # otherwise, only one of the chidren returned a node, meaning either p or q ertr found on left or right branch. 
        # in this case where the node was found would be the LCA
            return left or right
        

        

# Create the tree
tree1 = 
#given test cases
print(hw9().lowestCommonAncestor(tree1, 1, 5)) #4, 4 is the only common ancestor of 1 and 5.
print(hw9().lowestCommonAncestor(tree1, 3, 1)) # expected output 3,  Since 3 is the parent of 1, 3 is the lowest common ancestor of 3 and 1.  