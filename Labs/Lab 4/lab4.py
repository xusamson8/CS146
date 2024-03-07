class TreeNode(object):
        def __init__(self, val=0, left=None, right=None):
            self.val = val
            self.left = left
            self.right = right

class lab4:
    def invertTree(self, root):
        if not root: #if its null
             return None
        if root: #if its not null then proceed
            self.invertTree(root.left)
            self.invertTree(root.right)
            #self refers to the current isntance of the class, so broken up ; root.left is the "self" for self.invertTree(root.right)
            root.left, root.right = root.right, root.left
            return root
            #tmp redundant? ;  could do it like... root.left, root.right = root.right, root.left
            # tuple unpacking makes multiple assignments in a single statement possible and is particularly useful for swapping operations.
            #tmp = root.left;
            #root.left = root.right;
            #root.right = tmp; 

         
             
             
