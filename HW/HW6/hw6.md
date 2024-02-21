### HW 6 : ThreeSum

#### Java



#### Python
sorting input array helps with knocking out duplicate solutions , if we get a number thats already 
in the same position we dont want it, we know since it is the neighbor (if its the same)
after getting the first number, the other two would be like twoSum , we can use left right pointer
if it adds up to 0, put it in solution set, if > 0 shift right pointer to decrease sum , since numbers alr sorted
vice verssa for if sum < 0. there could be duplicates among pointers, so shift