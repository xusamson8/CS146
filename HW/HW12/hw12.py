from typing import List

class hw12:
  def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
    def find(x: int) -> int:
      if p[x] != x:
        p[x] = find(p[x])
      return p[x]

    for i, w in enumerate(wells, 1):
      pipes.append([0, i, w])
    pipes.sort(key=lambda x: x[2])
    p = list(range(n + 1))
    ans = 0
    for a, b, c in pipes:
      pa, pb = find(a), find(b)
      if pa != pb:
        p[pa] = pb
        n -= 1
        ans += c
        if n == 0:
          return ans
          
  def test_cases():
      solution = hw12()
      
      #given test case
      n1 = 2
      wells1 = [1, 1]
      pipes1 = [[1, 2, 1], [1, 2, 2]]
      print("Test Case 1 Output:", solution.minCostToSupplyWater(n1, wells1, pipes1))
      #expected output: 2