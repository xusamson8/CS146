## HW 1 Markdown

### Java Solution
The Java solution first checks if the string is empty, if it is then it returns as true.
If it isn't then we would have to check the characters, we have to initialize to variables, two numbers the represent, one at the start of the word and one at the end of the word (0, and s.length()-1).
Next we have a while loo that traverses when the start integer (of the word) is smaller than the ending, 
during this traversal, it checks it the characters in those positions are alphanumerical, if they are't then traverse to the right (++ for the start), and traverse to the left (-- for the end), if they are aplhanumerical, then compare then and if they aren't the same, return false. if they are the same keep traversing. if it is a palindrome it will return true.


### Python Solution
The Python solution differs from the Java one as it is much shorter and simpler.
A new list of the characters in String s is made that filters out non-alphanumeric characters with ".isalnum()", and makes the character into lowercase if it is alphanumeric. 
After this, the list is compared to the reversed version to see if they're the same (too check if its a palindrome)