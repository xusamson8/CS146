class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

class lab5:
    def isValidBST(self, root: TreeNode) -> bool :
        def isValidBSTHelper(node, left, right):
            if not node:
                return True #an empty BST is still a BST
            if not (node.val < right and node.val > left):
                # if value isn't less than right boundary and greater than left boundary
                #,therefore if its greater than maxBound and lesser than minBound, it breaks the BST property
                return False 
                #if not true, return false since conditions aren't satisfied and node broke bst properties
            #recursive call
            return isValidBSTHelper(node.left, left, node.val) and isValidBSTHelper(node.right, node.val, right) #if both are true then we can return true, whatever these return are the result
            #when going left,we want to make sure left subtree is valid
            # we update node with left child, its minBound stays the same since we're going left, the right boundary is the nodes value, the left subtree has to be less than the parent so its now the right boundary
        return isValidBSTHelper(root, float("-inf"), float("inf")) #return the helper function we just created
            
