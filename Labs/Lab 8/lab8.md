### Lab 8
think about what was went over in class, we should go with a greedy approach, but it won't work all the time. Think of if the 5 cent denomination is removed
sub problem may be that the amount changes when we subtract a denomination once?
- meanin we will probbaly need something with dynamic programming as well such as memoization

based off test cases... 
if the amount is 0, return 0, if not possible return -1.. this will be true all the time
#### Java
same as python , different syntax

#### Python
create dynamic programing array, initialize to length +1, [0 to end of array], we know the base cases as mentioned above 
we have to compute every value in dp, for every amount a in the range 1 to the amount (bottom up, brute force way) we take a, and subtract the current coin we're looking at (if non negative) ,  if it works it is a possible solution, we set it to the minimum of dp(a) and 1 + dp(a-c) 