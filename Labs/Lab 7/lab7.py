from ast import List
import math


class lab7:
    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
    #Your code here
        #matrix w/ distance infinity, set the distance to self as 0 (no self loop for purposes of this class) 
        dist = [[math.inf] * n for _ in range(n)]
        for i in range(n):
            dist[i][i] = 0

        for u, v, w in edges:
            dist[u][v] = dist[v][u] = w #distances filled based on essay 

        #Floyd-Warshall algorithm:distance updated to shortest path so far
        for k in range(n):
            for i in range(n):
                for j in range(n):
                    if dist[i][j] > dist[i][k] + dist[k][j]:
                        dist[i][j] = dist[i][k] + dist[k][j]

        cnt = [0] * n #count cities if within threshold
        for i in range(n):
            for j in range(n):
                if i == j: continue 
                if dist[i][j] <= distanceThreshold:
                    cnt[j] += 1

        #find city with minumum amt of reachable cities
        ans = 0
        for i in range(n):
            if cnt[i] <= cnt[ans]:
                ans = i
        return ans