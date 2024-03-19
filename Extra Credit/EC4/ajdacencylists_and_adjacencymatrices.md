### "Everything Everywhere All At Once"
implementations (in both java and python) and explanations are all presented under each question in this markdown file.

### Given an adjacency list, how can you convert it to an adjacency matrix? 
- since an adjacency list contains a list for each vertex, and inside the list are lists that contain the neighbors of the vertex. With this knowledge, we can now ocnvert it to a matrix, to do this, we can create a 'n * n' matrix , where n is the number of vertices (for the example we saw in class there were 5 vertices and it was a 5 by 5). We can iterate over each list and set matrix[u][v] to "True" to each neighbor "u" of vertex "v"
(for the purposes of this class we would set the vertex referring to itself to False).


- python implementation below
``` python

```

- java implementation below
``` java

```


<br/>

### Given an adjacency matrix, how can you convert it to an adjacency list? 
- An adjacency matrix is an 'n * n' matrix where matrix[c][r] is "True" if there is an edge from vertex c to vertex r (Except for itself for this class). To convert it to a list, we create a list of empty lists for each vertex. We then iterate over the matrix, and for each "True" we find, we append c to the list corresponding to vertex r.

- python implementation below
``` python

```

- java implementation below
``` java

```

<br/>

### Given a directed graph, how can you reverse the direction of each edge?
- To reverse the direction of each edge in a directed graph (lets say it us represented as an adjacency list since it is faster), we create a new list of empty lists. We then iterate over the original list, and for each neighbor u of vertex v, we append v to the list of u in the new list.

- python implementation below

``` python

```


- java implementation below
``` java

```


