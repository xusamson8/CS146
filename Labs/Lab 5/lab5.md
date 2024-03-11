### Lab 5
we need to know the propertiees of a correct BST, and to solve this we use depth-first search, (because the leaf nodes may still have a valid relationship with its parent, but not roots above; we can't just check the neighbors)
the root value can be any value, it doesnt have a parent, can be any value btwn negative infinity, and positive infinity, we should use long , we have to check if those childs meet the properties comparing to root, and see if that noe has children as well. 
whenever we traverse the nodes, we have to update the boundaries , (if the node fits the BST compared to its parent and/or root)

#### Java
example:         
        min max helper function when looing at subtrees?
        uupper bound 5 (highest possible value in left subtree) vice versa
         that means if we see a value higher thean the upper bound in the left subtree its automatically false
        every time we look at a new subtree, update upper and lwor bounds

code: we will need a helper method with bounds
we'll start with the helper function, where we create an if statement to check if the node is null, if it is then return true (an empty bst is still a bst), an another if statement, to see if the node satisfies the properties of BST with the bounds, if it doesn't then return false. 
we call this recusively, which updates the node to the left / right child, and updates the max or minbound.

for the main function, we start with the root node, and the bounds the min/max value of long as it can be infinitely large.

#### Python
same implementation as java, but with python syntax