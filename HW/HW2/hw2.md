### HW 2 Solution

#### Java Solution
We are given an API already, and out goal is to search for a number that produces an error (which number causes the versions to go bad). Since we are looking for a number that goes wrong and causes it to go bad, I decided to use the binary search approach. it starts off like any other binary search, initializing low and high, using a while loop and stting a mid value. The mid value is written this way so that there wouldn't be an error on time. Then it works like a binary search, and keeps looking for values, if true is returned the high will be changed, otherwise low will be changed. If the while loop is stopped, we have our vlaue that caused the cases to go bad.

#### Python Solution
the python solution is pretty much the same as the java one , but in pythion syntax