### HW 7 minMeetingRooms
essentially, we want to see the maximum numbers of meetings occuring at once, therefore allowing us to understand the minimum meeting rooms we need

#### Java
intuition: we want to look at the start and end times, also initializing a variable of count. which keeps track of meetings that are currently occurring. This value of count would keep getting incremented/decremented depending on if a meeting is started or ended, then we will return the max value of the number, denoting the max numbers of meetings that occured; which is the same number as the minimum number of meeting rooms we need. 

make arrays of start times, and end times.
if the start time is lesser than the end time it is comparing to, then increment count, shift pointer of start
if the end case is graeter than start case, decrement count, shift pointer of end array
keep doing this until we reach the end (decrements to 0, no more times)
return max of count

#### Python
same process and logic as the java method, but in python syntax