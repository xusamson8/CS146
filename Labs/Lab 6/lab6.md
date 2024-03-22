### Lab 6
we are basically checking for cycles, if there is a cycle then return false . It is not possible if there is a cycle.
basically run topilogical sort, which only works for DAGs. (therefore if it isn't a DAG ( aka directed acylic graph) aka there are cycles, and topilogical sort can't run then return false).

use a set to determine if there is a loop (if it cycles), and if there is then we can return false. The set keeps track of what prerequisites we have visited so far.

#### Java
implement topological sort in Java to check if its a DAG.



#### Python