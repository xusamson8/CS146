### HW8
we need to figure out the length of the longest palindrome possible given the string.

I can notice that there is a property, we see that each character in the output has a duo (even # of occurences), except 1 letter. 

intuition: we would count the letters in a string, that has one duplicate, with that count we can multiply it by 2 and add 1 , since 1 non-duplicate is acceptable. A set would help us count the letters that have a duplicate. 

#### Java
check if the string is null , 
create a hashset, and counter
go through the string and see if the letters within the string are already in the hashset, if they are then remove it and increment count, if not thne add it onto the hashset, return the count (using the property of the palindromes)

#### Python
same intuition and implementation as the java version, but with python syntax.