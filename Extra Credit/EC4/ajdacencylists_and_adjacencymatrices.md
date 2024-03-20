## "Everything Everywhere All At Once"
implementations (in both java and python) and explanations are all presented under each question in this markdown file.

### Given an adjacency list, how can you convert it to an adjacency matrix? 
- since an adjacency list contains a list for each vertex, and inside the list are lists that contain the neighbors of the vertex. With this knowledge, we can now ocnvert it to a matrix, to do this, we can create a 'n * n' matrix , where n is the number of vertices (for the example we saw in class there were 5 vertices and it was a 5 by 5). We can iterate over each list and set matrix[u][v] to "True" to each neighbor "u" of vertex "v"
(for the purposes of this class we would set the vertex referring to itself to False).

- python implementation below
``` python
def adj_list_to_matrix(adj_list):
    n = len(adj_list)
    matrix = [[False] * n for _ in range(n)] #sets everything to false, creates matrix
    for i, neighbors in enumerate(adj_list):
        for j in neighbors:
            matrix[i][j] = True  #0-based indexing, true if in the list/neighbors
    return matrix
```

- java implementation below
``` java
   public static boolean[][] listToBoolMatrix(List<List<Integer>> adjList) {
        int n = adjList.size();
        boolean[][] adjMatrix = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j : adjList.get(i)) {
                if (i != j - 1) { //Converts to 0-based index, skip self-loops, same intuion as above
                    adjMatrix[i][j - 1] = true;
                }
            }
        }
        return adjMatrix;
    }
```

<br/>

### Given an adjacency matrix, how can you convert it to an adjacency list? 
- An adjacency matrix is an 'n * n' matrix where matrix[c][r] is "True" if there is an edge from vertex c to vertex r (Except for itself for this class). To convert it to a list, we create a list of empty lists for each vertex. We then iterate over the matrix, and for each "True" we find, we append c to the list corresponding to vertex r.

- python implementation below
``` python
def matrix_to_adj_list(matrix):
    adj_list = [] #creation
    for i, row in enumerate(matrix):
        adj_list.append([j for j, has_edge in enumerate(row) if has_edge])
    return adj_list
```

- java implementation below
``` java
public static List<List<Integer>> boolMatrixToList(boolean[][] adjMatrix) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < adjMatrix.length; i++) {
            List<Integer> neighbors = new ArrayList<>();
            for (int j = 0; j < adjMatrix[i].length; j++) {
                if (adjMatrix[i][j]) {
                    neighbors.add(j + 1); //Convert to 1-based index
                }
            }
            adjList.add(neighbors);
        }
        return adjList;
    }
```

<br/>

### Given a directed graph, how can you reverse the direction of each edge?
- To reverse the direction of each edge in a directed graph (lets say it us represented as an adjacency list since it is faster), we create a new list of empty lists. We then iterate over the original list, and for each neighbor u of vertex v, we append v to the list of u in the new list.


- python implementation below

``` python
def reverse_directed_graph(adj_list): #create a new adjacency list initialized with empty lists for each vertex
    reversed_graph = [[] for _ in range(len(adj_list))]
    for vertex, edges in enumerate(adj_list):
        for neighbor in edges:
            reversed_graph[neighbor].append(vertex)
    return reversed_graph
```


- java implementation below
Iterate over the original adjacency list and add the reversed edges to the new reversed graph adjacency list ArrayList to represent the adjacency list, and for each directed edge (u, v), we add u to the list of neighbors for v in the reversedGraph.
``` java
   public static List<List<Integer>> reverseDirectedGraph(List<List<Integer>> adjList) {
        List<List<Integer>> reversedGraph = new ArrayList<>();
        for (int i = 0; i < adjList.size(); i++) {
            reversedGraph.add(new ArrayList<>());  // Initialize the reversed graph with empty lists
        }
        for (int vertex = 0; vertex < adjList.size(); vertex++) {
            for (int neighbor : adjList.get(vertex)) {
                reversedGraph.get(neighbor).add(vertex);  // Add the reversed edge
            }
        }
        return reversedGraph;
    }
```


