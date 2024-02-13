### Lab 3

#### Problem 1

1. 10000000000n^2 vs n^3
    **n^3 is asymptotically greater**
    we only care about the largest factor (the exponent is graeter, therefore it grows faster...) and can ignore any numbers before or after (can disregard the 0s, no matter how many are added). In this case cubic is greater than quadratic. n^3 > n^2. O(N^3) > O(N^2)

2. (n^2) log(n) vs n(log(n))^10
    **(n^2)log(n) is aymptotitcally greater**
    if we log both sides, --> log(n^2) log(log(n)) vs log(n) log(log(n)^10)
    using power rule for logs, this would result in the simplified equations 
    2 log(n) log(log(n)) v.s log(n) log(10log(n))
    ... product rule for logs?
    n^2log(n) v.s n(10log(n)) , if we ignore the constants and get the largest terms, these 

3. n^log(n) vs 2^(sqrt n)
    log ab = log a + log b
    log a^b = b log a

    n ^ (log n ) vs 2 ^ (sqrt n)
    log n (log n) vs (sqrt n )log 2
    log (log(n)^2 ) vs log ( sqrt n log^2)
    2 log(logn) vs log sqrt n + log log 2
    ...

4. 2^n vs 2^((2n))
    2^(2n) is aymptotically greater than 2^n , because the exponent is greater. If we expand to infinity, 2^2n will be greater than 2^n just from the exponenet ( 2n > n)

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

Best Case: 
    if it doesnt enter the loop ( 0 or 1 ) it will be constant time O(1) . note: dont really think about these cases for these questions?
    or if it is a multiple of 2, it will exit after the first comparison.

Worst Case:
    a prime number, the number will have to be greater than n to exit the loop

Average Case:
    same as worst case? or is it O(n). sometimes theta cant be found if best and worst are very diff.
