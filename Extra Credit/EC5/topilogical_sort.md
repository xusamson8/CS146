# "Topological Sorting and other party tricks"
This markdown file contains the explanations for each implementation of Topological sort: Kahn's Algorithm, DFS Topological Sort and BFS Topological Sort.
The code and inputs will be in the files within the folder this file is in.

notes: 
DFS is typically implemented with LIFO (a stack if you will) - last in first out.

BFS typically implemented with FIFO (a queue if you will) - first in first out.
<br/>

## question: is kahn's techniaclly a BFS Topological Sort??
(this is why an implementation of the BFS isnt present here)

## Kahn's Algorithm

Kahn’s Algorithm for Topological Sorting:
Kahn’s Algorithm for Topological Sorting is a method used to order the vertices of a directed graph in a linear order such that for every directed edge from vertex A to vertex B, A comes before B in the order. The algorithm works by repeatedly finding vertices with no incoming edges, removing them from the graph, and updating the incoming edges of the remaining vertices. This process continues until all vertices have been ordered.

Algorithm:
Add all nodes with in-degree 0 to a queue.
While the queue is not empty:
Remove a node from the queue.
For each outgoing edge from the removed node, decrement the in-degree of the destination node by 1.
If the in-degree of a destination node becomes 0, add it to the queue.
If the queue is empty and there are still nodes in the graph, the graph contains a cycle and cannot be topologically sorted.
The nodes in the queue represent the topological ordering of the graph.
How to find the in-degree of each node? 
To find the in-degree of each node by initially calculating the number of incoming edges to each node. Iterate through all the edges in the graph and increment the in-degree of the destination node for each edge. This way, you can determine the in-degree of each node before starting the sorting process.

<br/>

## DFS Topological Sort
Here’s a step-by-step algorithm for topological sorting using Depth First Search (DFS):

Create a graph with n vertices and m-directed edges.
Initialize a stack and a visited array of size n.
For each unvisited vertex in the graph, do the following:
Call the DFS function with the vertex as the parameter.
In the DFS function, mark the vertex as visited and recursively call the DFS function for all unvisited neighbors of the vertex.
Once all the neighbors have been visited, push the vertex onto the stack.
After all, vertices have been visited, pop elements from the stack and append them to the output list until the stack is empty.
The resulting list is the topologically sorted order of the graph.

explanation:
We start DFS from node 0 because it has zero incoming Nodes
We push node 0 in the stack and move to next node having minimum number of adjacent nodes i.e. node 1.

In this step , because there is no adjacent of this node so push the node 1 in the stack and move to next node.

In this step , We choose node 2 because it has minimum number of adjacent nodes after 0 and 1 .
We call DFS for node 2 and push all the nodes which comes in traversal from node 2 in reverse order.
So push 3 then push 2 .

We now call DFS for node 4
Because 0 and 1 already present in the stack so we just push node 4 in the stack and return.

In this step because all the adjacent nodes of 5 is already in the stack we push node 5 in the stack and return.

Step 6: This is the final step of the Topological sorting in which we pop all the element from the stack and print it in that order .




<br/>


