### Lab 6
we are basically checking for cycles, if there is a cycle then return false . It is not possible if there is a cycle.
basically run topilogical sort, which only works for DAGs. (therefore if it isn't a DAG ( aka directed acylic graph) aka there are cycles, and topilogical sort can't run then return false).

use a set to determine if there is a loop (if it cycles), and if there is then we can return false. The set keeps track of what prerequisites we have visited so far.



#### Java
implement topological sort in Java to check if its a DAG.
BFS appraoch / sort of Kahn's algorithm
make a graph wehre each course points to its prerequisites
we will also count the indegrees of the prerequisites, to know which goes first

initalizae the graph with empty array lists , for each course and its prereqs
we then build the graph, incremeneting each prerequisite count as well

we can add the prerequisites with 0 indegrees to the queue, and increment our count 

we create a  while loop, that goes through the queue

we remove the course we know we can take, and decrement the course that is dependent the indegrees on that prerequisite, if the indegrees are 0 thn we add it to the quque and add up the count

if our count at then end matches the number of courese then we can return true



#### Python
similar approach with kahns and bfs, but in python syntax