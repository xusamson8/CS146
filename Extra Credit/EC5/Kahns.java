import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Kahns {

    //!!!! CONTAINS KAHN's ALGORITHM, DFS, AND BFS TOPOLOGICAL SORTS !!!!

    // start of kahn's algorithm topological sort
    public static List<Integer> Kahn(List<List<Integer> > adj, int V)
    {
        // Vector to store indegree of each vertex
        int[] indegree = new int[V];
        for (List<Integer> list : adj) {
            for (int vertex : list) {
                indegree[vertex]++;
            }
        }
 
        // Queue to store vertices with indegree 0
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            result.add(node);
            // Decrease indegree of adjacent vertices as the
            // current node is in topological order
            for (int adjacent : adj.get(node)) {
                indegree[adjacent]--;
                // If indegree becomes 0, push it to the
                // queue
                if (indegree[adjacent] == 0)
                    q.add(adjacent);
            }
        }
 
        // Check for cycle
        if (result.size() != V) {
            System.out.println("Graph contains cycle!");
            return new ArrayList<>();
        }
        return result;
    }
    //end of kahn's algorithm topological sort
 


    public static void main(String[] args)
    {
        int n = 4; // Number of nodes
 
        // Edges
        List<List<Integer> > edges = Arrays.asList(
        Arrays.asList(0, 1), Arrays.asList(1, 2),
        Arrays.asList(3, 1), Arrays.asList(3, 2));
 
        // Graph represented as an adjacency list
        List<List<Integer> > adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        // Constructing adjacency list
        for (List<Integer> edge : edges) {
            adj.get(edge.get(0)).add(edge.get(1));
        }
 
        // Performing topological sort
        System.out.print(
            "Topological sorting of the graph: ");
        List<Integer> result = Kahn(adj, n);
 
        // Displaying result
        for (int vertex : result) {
            System.out.print(vertex + " ");
        }
    
        }
    }

