### Matrices Time Complexity Analysis

lets say that the below is the psuedo code and how many times each line is ran for the matrices algorithm , given two matrices A and B

```java
MATRIX_MULTIPLY(A, B): 
  if columns(A) ≠ rows(B):  // is executed 1 time
    raise ValueError("Matrix multiplication is not defined.") 

  rows_A ← number of rows in A  // executed one time, initialization 
  cols_A ← number of columns in A   // 1 time
  cols_B ← number of columns in B   // 1 time
  result ← matrix of size rows_A x cols_B filled with zeros  // 1 time

  for i from 1 to rows_A do: //runs for each row of matrix A, so rows_A times
    for j from 1 to cols_B do: //runs for each cols of matrix B, so cols_B times for each iteration of outer loop --> cols_B * rows_A times 
    sum ← 0 
      for k from 1 to cols_A do: // runs cols_A time for each iteration of middle loop --> cols_B * rows_A * cols_A times
        sum ← sum + A[i][k] * B[k][j] //executed every inner loop
      result[i][j] ← sum return result
```

by approximately calculating how may time each line runs, we can add these up to figure out the order of growth of this matrix algorithm.

we are given the resulting matrix which is  matrix of size rows_A x cols_B filled with zeros , which has (rows_A * cols_B cells), these are the outer and middle loop, and for each of these we perform (cols_A) times of multiplication and addition, (inner loop)

this results in a total of (rows_A * cols_B * cols_A ) actions of multiplication and addition in the cells

for simplification we can say that the size of each matrix is some aribitrary number N 
this means that the growth of nunbers of operations are N * N * N = N^3.

with this fact we can conclude that the matrix pseudocode with A and B is an algorithm that has a *cubic order of growth*