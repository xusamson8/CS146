### Lab 1 Hashmap solution

For Lab1 I decided to use the HashMap solution which would be more efficient than the brute force solution. 
To go about this approach i first created a hashmap.
This hashmap got its keys and values through looping the nums array. 
Then I created another loop, where I looked for the complement of the target, 
If the complement exists in the hashmap and the compleent is not i (no duplicate numbers), then we output an array 
consisting of the two numbers adding up to target.
if no complement exists then an empty array is outputted.