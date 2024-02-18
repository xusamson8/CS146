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

3. T(N) = 9T(N/2) + n^2 = Θ(n^(logbase2(9))) --> **Θ(3.17)**
- by recursing a few times ; T(N) = 9T(N/2) + N^2 ,T(N/2) = 9T(N/4) + (N/2)^2, T(N/4) = 9T(N/8) + (N/4)^2, ..., T(1) = 1 
we can tell that it N gets halved at each level of recursion tree, we can set it to T(N/2^k), and we set k to something that makes the whole thing equal to 1, in which k would be log_2(N). summing the series up we get n^3.17.
- checking our work with masters theorem verifies our answer, a = 9, b = 2, and f(N) = N^2. We compare f(N) with N^{logb(a)}, which is N^{log_2(9)} or N^{3.17} . Since f(N) = N^2 is polynomially smaller than N^{3.17}, this puts us in the first case of the master theorem. 
Case 1: If f(N) is in O(N^{log_b(a) - ε}) for some ε > 0, then T(N) is in Θ(N^{log_b(a)}).
Therefore, by the Master Theorem, the solution to the recurrence is T(N) = Θ(N^{log_2(9)}), which is approximately Θ(N^{3.17}).

4. T(N) = 100T(N/2) + n^(log_2(cn) + 1)  (c is a constant) = **Θ(NlogN)**
- we will use the recursion tree method , and assume that c is truly constant, now f(n) = n^2(log_2(n)+ 1).
at the 1st level: 100 T(N/2) + n^(log_2(n)) , level 2 : 100^2 T(N/4) + (n/2)^(log_2(n/2)). if we keep expanding and adding the series, and figure out when it keeps recursing it is T(N/2^k), when k = log_2(n) it will stop recursing. 
we can tell the calls are heavily influenced by complexity O(nlogn) giving us our answer, **Θ(NlogN)**

5. T(N) = 4T(N/2) + n^2(logn) = **Θ(N^2logN)**
- if we keep on recursing it like the previous problem, the T(N/2) keeps getting smaller and smaller and we can say its T(N/2^k) , with a k value making N/2^k 1 to stop the recursion . when N = 2k or k = log_2(N). As we keep expanding the equation, and summing the series up , each is a product power of N, a power of 4, and a loragirthmic term . eventually giving us Θ(N^2logN). The dominant term will be the one with the highest power of N as N grows larger.
we can confirm this with the 2nd case of masters theorem.

6. T(N) = 5T(N/2) + n^2/(logn) = **Θ(N^(log_2(5)))**
- expand the tree , at each level the cost is 5^K ((N/2^i)^2 / log(N/2^i)) using the same steps as before, expanding and summing, then using the masters theorem to verify, we verify and find out the time complexity is Θ(N^(log_2(5))).

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

- if we say that yetAnotherFunc(n): is T(N)
, the loop executes 10N times
,yetAnotherFunc(n/2); is T(N/2)
,yetAnotherFunc(n/2); and this is another T(N/2)

- By using masters theorem with T(N) = 2T(N/2) + 10N, a = 2 , b = 2 , f(n) = 10N ; 
with these variables, and taking n^(logba) we figure out that n^log2(2) = n^1 and compare it to f(n) = 10N asymptotically
since they are asymptotically close, we can use the 2nd case of Master's Theorem. f(n) = Θ(n ^ (logb(a)-e) log^k) where k >= 0 then T(n) = Θ(n^(logb(a) log^(k+1)n). 

- this gives us the time complexity of **Θ(NlogN)** for this psuedocode algorithm.

