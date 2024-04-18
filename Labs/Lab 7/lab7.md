### Lab 7
There are n cities numbered from 0 to n-1. Given the array edges where edges[i] = [fromi, toi, weighti] represents a bidirectional and weighted edge between cities from i and to i, and given the integer distanceThreshold.

Return the city with the smallest number of cities that are reachable through some path and whose distance is at most distanceThreshold, If there are multiple such cities, return the city with the greatest number.

Notice that the distance of a path connecting cities i and j is equal to the sum of the edges' weights along that path.

Intuition: since we are looking for the *smallest number* of cities that are reachable through some path, we should use Floyd Warshall's algorithm. 
#### Java
create a 2d matri first, and then create the paths to the cities, use floyd warshalls algorithm see which distance is the shortest by using math min, 
the numbers to the cities have to be smaller than the threshold , increment the count of possibilities for the city
with this count, we keep track of a city that has the smallest number of reachable paths
return that city

#### Python
similar intuition, syntax in python