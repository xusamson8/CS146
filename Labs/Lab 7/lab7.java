import java.util.Arrays;

public class lab7 {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        //matrix records shortest distance btwn two cities
        int[][] dis = new int[n][n];
        
        //city w/ the least # of reachable cities
        int res = 0;
        
        //smallest # of reachable cities found (so far)
        int smallest = n;
        
        for (int[] row : dis) //no direct path, distance matrix filled with a large number
            Arrays.fill(row, 10001);
        
        for (int[] e : edges)
            dis[e[0]][e[1]] = dis[e[1]][e[0]] = e[2]; //set the distance for direct edges
        
        
        for (int i = 0; i < n; ++i)
            dis[i][i] = 0; //city and itself distance is 0 
        
        for (int k = 0; k < n; ++k)
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]); //Floyd-Warshall alg, compute the shortest paths
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            
            //number of cities within the distance threshold for city 'i'
            for (int j = 0; j < n; ++j)
                if (dis[i][j] <= distanceThreshold)
                    ++count;
            
            //if count<= to the smallest found so far, update the result and smallest count
            if (count <= smallest) {
                res = i;
                smallest = count;
            }
        }
        
        //return city w/ the least # of reachable cities within distance threshold
        return res;
    }
}
