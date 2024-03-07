### HW 9
intuition: check if roots exist or not, and check if its what we're finding. the LCA of something can be itself, (normal case and over lappin cases to consider). the recursion goes bottom to top, 
1. if we find q and p , its parent has to be the LCA, (or if its itself)
2. if one side is null, we return the node of what we have so far as the lowest

if we have to go left or right, the root is updated, we are still looking for p or q, if we hit something that meets the conditions we stop, and return it. Other wise we go all the way to the bottom and keep comparing with its parents, (what is meant by when recursing it goes bottom to up)

#### Java 
    use if statement to see if root exists., if its null we cant find the LCA return none

    if it does exist, see if its equal to p or q, if its what we're finidng we can return it, the root can be the LCA. (if root is either of these values, we have found waht we're searching for.)

    otherwise, we perform a search on this node. recursively search left and right subtrees; we have to find either p or q on the left or right, we keeop going down with the recursion and search. when it comes back up (the base cases would be met)
    the bases cases would come back to us, thn e would have to analyze it

    if we get nothing on the right search, we return what we got on the left search, vice versa, . But if both come back, the node that we are holding is the LCA (we found something on both the right and left then we return ourselves)
    

#### Python
    same implementation as java version but in python syntax