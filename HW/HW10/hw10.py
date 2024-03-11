from ast import List


class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
        #python definiiton for treenodes
         self.val = val
         self.left = left
         self.right = right

class hw10:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        #Your code here