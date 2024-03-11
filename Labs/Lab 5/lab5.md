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

#### Python
same implementation as java, but with python syntax