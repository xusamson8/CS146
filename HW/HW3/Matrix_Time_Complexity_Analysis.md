### Matrices Time Complexity Analysis

lets say that the below is the psuedo code and how many times each line is ran for the matrices algorithm , given two matrices A and B

```
MATRIX_MULTIPLY(A, B): 
  if columns(A) ≠ rows(B): <> (is executed 1 time
    raise ValueError("Matrix multiplication is not defined.") 

  rows_A ← number of rows in A // executed one time, initialization 
  cols_A ← number of columns in A  // 1 time
  cols_B ← number of columns in B  // 1 time
  result ← matrix of size rows_A x cols_B filled with zeros // 1 time

  for i from 1 to rows_A do: 
    for j from 1 to cols_B do: 
    sum ← 0 
    for k from 1 to cols_A do: 
      sum ← sum + A[i][k] * B[k][j] 
    result[i][j] ← sum return result
```




