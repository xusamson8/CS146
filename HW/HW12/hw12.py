from typing import List

class hw12:
  def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
    #functions finds root of an element
    def find(x: int) -> int:
      if p[x] != x:
        p[x] = find(p[x])
      return p[x]

    for i, w in enumerate(wells, 1):
      #virtual edge from 0 node , with cost of well in house
      pipes.append([0, i, w])
    #sorts edges with costs
    pipes.sort(key=lambda x: x[2])
    #find sturcture initializeiation, each node is its own parent
    p = list(range(n + 1))
    ans = 0
    #go over each pipe iterating
    for a, b, c in pipes:
      pa, pb = find(a), find(b) #find the root of its parents
      if pa != pb:
        #if diff, add cost 
        p[pa] = pb
        #decrement # of nodes if connected
        n -= 1
        ans += c
        #if there are no more nodes left aka all connected 
        if n == 0:
          return ans
 
          
  def test_cases(self):
      solution = hw12()
      #given test case
      n = 2
      wells = [1, 1]
      pipes = [[1, 2, 1], [1, 2, 2]]
      print("Test Case Output:", solution.minCostToSupplyWater(n, wells, pipes))
      #expected output: 2

if __name__ == "__main__":
    hw12().test_cases()
