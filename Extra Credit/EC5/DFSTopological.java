import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DFSTopological {
    // start of function to perform DFS and topological sorting
    public static void DFStopologicalSortUtil(int v, List<List<Integer> > adj,
        boolean[] visited,
        Stack<Integer> stack)
    {
        // Mark the current node as visited
        visited[v] = true;
  
        // Recur for all adjacent vertices
        for (int i : adj.get(v)) {
            if (!visited[i])
                DFStopologicalSortUtil(i, adj, visited, stack);
        }
  
        // Push current vertex to stack which stores the
        // result
        stack.push(v);
    }
  
    // Function to perform DFS Topological Sort
    public static void DFStopologicalSort(List<List<Integer> > adj, int V)
    {
        // Stack to store the result
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
  
        // Call the recursive helper function to store
        // Topological Sort starting from all vertices one
        // by one
        for (int i = 0; i < V; i++) {
            if (!visited[i])
                DFStopologicalSortUtil(i, adj, visited, stack);
        }
  
        // Print contents of stack
        System.out.print(
            "Topological sorting of the graph: ");
        while (!stack.empty()) {
             System.out.print(stack.pop() + " ");
        }
    }
    // end of DFS topological sort

    public static void main(String[] args)
    {
    
        ////// start of DFS topological sort algorithm test

        // Number of nodes
        int V = 4;
 
        // Edges
        List<List<Integer> > edges2 = new ArrayList<>();
        edges2.add(Arrays.asList(0, 1));
        edges2.add(Arrays.asList(1, 2));
        edges2.add(Arrays.asList(3, 1));
        edges2.add(Arrays.asList(3, 2));
     
        // Graph represented as an adjacency list
        List<List<Integer> > adj2 = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj2.add(new ArrayList<>());
        }
     
        for (List<Integer> i : edges2) {
            adj2.get(i.get(0)).add(i.get(1));
        }
     
         DFStopologicalSort(adj2, V);

        }
}
