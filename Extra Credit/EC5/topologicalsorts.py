from collections import deque


class topologicalsorts:
    #start of kahn;s algorithm Function to return list containing vertices in Topological order., 
    def Kahns(adj, V):
        # Vector to store indegree of each vertex
        indegree = [0] * V
        for i in range(V):
            for vertex in adj[i]:
                indegree[vertex] += 1
    
        # Queue to store vertices with indegree 0
        q = deque()
        for i in range(V):
            if indegree[i] == 0:
                q.append(i)
        result = []
        while q:
            node = q.popleft()
            result.append(node)
            # Decrease indegree of adjacent vertices as the current node is in topological order
            for adjacent in adj[node]:
                indegree[adjacent] -= 1
                # If indegree becomes 0, push it to the queue
                if indegree[adjacent] == 0:
                    q.append(adjacent)
    
        # Check for cycle
        if len(result) != V:
            print("Graph contains cycle!")
            return []
        return result
    #!!end of kahns algorithm 

    def DFStopologicalSortUtil(v, adj, visited, stack):
        # Mark the current node as visited
        visited[v] = True
    
        # Recur for all adjacent vertices
        for i in adj[v]:
            if not visited[i]:
                DFStopologicalSortUtil(i, adj, visited, stack)

        # Push current vertex to stack which stores the result
        stack.append(v)
 
 
# Function to perform Topological Sort
    def DFStopologicalSort(adj, V):
        # Stack to store the result
        stack = []
    
        visited = [False] * V
    
        # Call the recursive helper function to store
        # Topological Sort starting from all vertices one by
        # one
        for i in range(V):
            if not visited[i]:
                DFStopologicalSortUtil(i, adj, visited, stack)
    
        # Print contents of stack
        print("Topological sorting of the graph:", end=" ")
        while stack:
            print(stack.pop(), end=" ")
    

    
#start of testing
    if __name__ == "__main__":
        n = 4  # Number of nodes
    
        # Edges
        edges = [[0, 1], [1, 2], [3, 1], [3, 2]]
    
        # Graph represented as an adjacency list
        adj = [[] for _ in range(n)]
    
        # Constructing adjacency list
        for edge in edges:
            adj[edge[0]].append(edge[1])
    
        # Performing topological sort
        print("Topological sorting of the graph:", end=" ")
        result = Kahns(adj, n)
    
        # Displaying result
        for vertex in result:
            print(vertex, end=" ")

    ##start of test of DFS Topological?
        # Number of nodes
        V = 4
    
        # Edges
        edges = [[0, 1], [1, 2], [3, 1], [3, 2]]
    
        # Graph represented as an adjacency list
        adj = [[] for _ in range(V)]
    
        for i in edges:
            adj[i[0]].append(i[1])
    
        DFStopologicalSort(adj, V)        

    ## end of test for DFS topological
            

