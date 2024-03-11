### Lab 5
we need to know the propertiees of a correct BST, and to solve this we use depth-first search, (because the leaf nodes may still have a valid relationship with its parent, but not roots above; we can't just check the neighbors)
the root value can be any value, it doesnt have a parent, can be any value btwn negative infinity, and positive infinity, we should use long , we have to check if those childs meet the properties comparing to root, and see if that noe has children as well. 
whenever we traverse the nodes, we have to update the boundaries , (if the node fits the BST compared to its parent and/or root)

#### Java


#### Python
same implementation as java, but with python syntax