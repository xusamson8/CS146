### HW5

#### Problem 1:
For each of the following recurrences, verify the answer you get by applying the master method, by solving the recurrence algebraically OR applying the recursion tree method. 

1. T(N) = 2T(N-1) + 1 = **Θ(2^n)**
- I solved this question using the substitution method. Lets say... T(N-1) = 2T(N-2) + 1, T(N-2) = 2T(N-3) + 1 ... so on and so forth
We can then substitute T(N-1) into the original equation.
Resulting in T(N) = 2T(2T(N-2)+1)+1 , and if we substituted T(N-2) ; T(N) = 2T(2T(2T(N-3)+1)+1)+1 ; on and on
by performing k such operations, this equation will begin to look like ; T(N) = 2^k T(N-k) + k
to get rid of the k , say k = n , then we will get ; T(N) = 2^n T(0) + N ; and T(N) is a constant
Finally we can say this has a time complexity of Θ(2^n)

2. T(N) = 3T(N-1) + n = **Θ(3^n)**
- I solved this question using the substitution method. Lets say... T(N-1) = 3T(N-2) + n, T(N-3) = 3T(N-3) + n ... so on and so forth
We can then substitute T(N-1) into the original equation.
Resulting in T(N) = 3T(3T(N-2)+n)+n , and if we substituted T(N-2) ; T(N) = 3T(3T(3T(N-3)+n)+n)+n ; on and on
by performing k such operations, this equation will begin to look like ; T(N) = 3^k T(N-k) + kn
to get rid of the k , say k = n and look for the largest asymptotical term, then we will get ; T(N) = 3^n T(0) ; and T(N) is a constant
Finally we can say this has a time complexity of Θ(3^n)

3. T(N) = 9T(N/2) + n^2
- 

4. T(N) = 100T(N/2) + n^(log(base2)cn + 1)  (c is a constant)
- 

5. T(N) = 4T(N/2) + n^2(logn)


6. T(N) = 5T(N/2) + n^2/(logn)
- 

#### Problem 2

Below is some pseudocode. Come up with a recurrence relation, and solve that recurrence relation using any method of your choice.  Hint: This code is slightly different from the pseudocode we've seen before. Think carefully about which method will help you come up with a good recurrence relation to solve. 
~~~java
yetAnotherFunc(n): 
  if n > 1: 
    for(i=0;i<10n;i++)
      doSomething;
    yetAnotherFunc(n/2);
    yetAnotherFunc(n/2);
~~~

