class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
        #python definiiton for treenodes
         self.val = val
         self.left = left
         self.right = right

class hw9:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        curr = root #start at root until we find refilt

        while curr: #while it isnt null, 
            if p.val > curr.val and q.val > curr.val: #if both values are greater , then go on to left subtree
                curr = curr.right
            elif p.val < curr.val and q.val < curr.val:#elif both less, goto left subtree  (follows BST properties)
                curr = curr.left
            else:
                return curr #if a split occurs, ; we basically end uo finding the result
                #no return statement outside loop, with the constraints given we are guarnateed an outcome in this problem

# Create the tree
tree1 = 
#given test cases
print(hw9().lowestCommonAncestor(tree1, 1, 5)) #expected output 3,  Since 3 is the parent of 1, 3 is the lowest common ancestor of 3 and 1.  
print(hw9().lowestCommonAncestor(tree1, 3, 1)) #4, 4 is the only common ancestor of 1 and 5. 