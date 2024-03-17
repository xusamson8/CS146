from ast import List
import collections
from typing import Optional


class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
        #python definiiton for treenodes
         self.val = val
         self.left = left
         self.right = right

class hw10:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        ans = [] #final array, the rsulting answer
        queue = collections.deque() #initializes a queue.
        queue.append(root)

        #run BFS while it isnt empty
        while queue: 
            queueLen = len(queue) #get # of nodes in queue currently, loop trhough every single values
            # helps make sure we go through one level at a time
            level = [] #eachlevel is a list, gets added in the answer
            for i in range(queueLen):
                #fifo; this is what we want
                node = queue.popleft() 
                # note : pop():- This function is used to delete an argument from the right end of the deque.
                # popleft():- This function is used to delete an argument from the left end of the deque.

                if node: #checks non null before adding
                    level.append(node.val)
                    queue.append(node.left)
                    queue.append(node.right)
            if level:
                ans.append(level)
            #loop iterates every node in a single level, after we added that level, we add it to the result, keep running outside while loop until there are no nodes left in queue
        return ans

