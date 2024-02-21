### HW 6 : ThreeSum

#### Java
same reasoning and explanation as the python solution, put in java syntax, with the use of an arraylist. 


#### Python
sorting input array helps with knocking out duplicate solutions 
, if we get a number thats already  in the same position we dont want it, we know since it is the neighbor (if its the same)
after getting the first number, the other two would be like twoSum , we can use left , right pointers

create vrriable for usm for simplification

if sum is > 0 , shift right pointer to decrease sum , since numbers alr sorted
vice verssa for if sum < 0. there could be duplicates among pointers, so shift pointer left. , if it is a threesum then add it onto ans array continue till all possibilities are met.

