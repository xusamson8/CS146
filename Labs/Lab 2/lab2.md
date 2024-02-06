### Lab 2 Solution

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

#### Java Solution
For the Java approach, I first created character array for both inputs s and t , by using .toCharArray(). with these two character arrays of the strings, I then used Arrays.sort() , to sort both of the character arrays seperately. After that, I check if both sorted arrays were the same, and if they were then it is a palindrome.


#### Python Solution
The way I did the python one was by sorting two strings using the sorted() method in python. The sorted() function returns a sorted list of the specified iterable object. If the strings are the same the sorted list of characters should also be the same, both in length and alphabetically, therefore returning true of false if it is an anagram by definition. 