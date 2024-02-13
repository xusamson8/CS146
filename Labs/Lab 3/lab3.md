### Lab 3

#### Problem 1
We should check what N grows the largest as it grows. The most significant term which is the one that grows the fastest as n becomes very large will help determine the growth rate of the function.

1. 10000000000n^2 vs n^3
    **n^3 is asymptotically greater**

    we only care about the largest factor (the exponent is greater, therefore it grows faster...) and can ignore any numbers before or after (can disregard the 0s, no matter how many are added because n^3 will eventaully outgrow it). In this case cubic is greater than quadratic. n^3 > n^2. O(N^3) > O(N^2)

2. (n^2) log(n) vs n(log(n))^10
    **(n^2)log(n) is aymptotitcally greater**

    n^2 log(n) grows faster than n(log(n))^10 because, for large values of n (if we eventaully go to infinite), the quadratic term n^2 will outweigh the n * logarithmic term raised to the 10th power , if we are talking asymptomaticalluy greater , the n^2 will outweight the n , we take the biggest terms of both and ignore the rest.

3. n^log(n) vs 2^(sqrt n)
    **2^√n is asymptotically greater**

    n ^ (log n ) vs 2 ^ (sqrt n)
    log n (log n) vs (sqrt n)(log 2)
    can also then be written as 
    e^(log (n)^2) vs e^((sqrt n)(log 2))
    now that we deducted the equations to have the same base , 
    we can then compare the exponents (√n vs logn^2)
    as n grows very large, √n (we ignore the log2 since we only care about the largest terms) will outgrow log(n)^2
    we can verify that the square of a logarithm grows slower than the square root function on desmos graphing calculator.


4. 2^n vs 2^((2n))
    **2^(2n) is aymptotically greater**

     because the exponent is greater. If we expand to infinity, 2^2n will be greater than 2^n just from the exponenet (2n > n and both have the same base)

#### Problem 2
analyzing the time complexity with asymptotic notation for the psuedocode below.

```java
isPrime(n): 
  for(i = 2, i*i <= n; i++) {   // i * i = n , i^2 = n , i = O(sqrtN)
    if(n % i == 0) {
      return false
    }
  return true
  }
```

Best Case: **O(1)**
    - if it doesnt enter the loop ( 0 or 1 ) it will be constant time O(1) . note: dont really think about these cases for these questions?
    - or if it is a multiple of 2 (but not 2), it will exit after the first comparison. then returning false, 

Worst Case: **O(√N)**
    occurs when n is a prime number, the number will go through the whole loop until it is greater than n to exit the loop. This causes the loop to iterate fully and have the condition check everytime. (math to calculate shown above)

Average Case: **O(√N)**
    Sometimes theta cant be found if best and worst are very different.
    for the average case we would need to consider something between the worst and best case, which would be some number that would cause it to be between the worst and best case.
    in big-o we have to scale very large, and if it was something like √N/2, we would drop constant factors &/ co-efficients, resulting in the same answer as the worst case (typically happens, probably not all the time it will reflect worst case).