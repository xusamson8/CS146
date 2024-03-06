### HW 9
intuition: where a split occures, (if the valuesa re going ot a sepreate subtreee; then the lowest common ancestor has been found) or if both values are </> root, we know which way to go. if a value is the root itself, it is the ancestor of itself.

#### Java 
    same implementation and logic as pythoin version, but using java syntax.


#### Python
    we use the given definition of a tree in python. Assuming BST property, we first initiliaze and start with setting out current element as the root. while current isnt null, if p and q values are both greater than the current value, we set the right element of the curr to the new curr. Vice versa for the left side, but if these arent the cases this means that the root is equal to one of the values, or there has been a split (both values are no longer greater than root, ex: one may got left and one may go right); this means that we are at the LCA, we have found it and then return it.