### Insertion Sort Time Complexity Analysis

 lets say that this is the insertion sort algorithm in java below, with approximate numbers of times each line of code is ran in the comments

```java
public static int[] insertionSort(int[] A, int n){ // happens 1 time

    for( int i = 1 ; i < N ; i++>){ // happens n+1 times
        int key = A[i]; // n-1 times , bc inside outer for loop &  if we assume first element is sorted
        int j = i-1; // n-1 times

    while( j >= 0 ) && A[j] > key ){  //(n-1)( i times, i ranges from 1 to n-1) , sums to (N-1) * N / 2
        A[j+1] = A[j]; // same amt of times while loop condiiton is checked
        j = j-1; // same amt of times while loop condiiton is checked
    }
        A[j+1] = key; // n-1 times

    }
    return A; // 1 time
}
```

when we add the times each line of code is ran all up and base it on a worst case scenario where the while loops have to be ran, 

we will eventually end up with a simplified quation in the polynomial form > ax^2 + bx + c due to the while loop, if it goes from i to n-1, = 1+2+3+...+ n-1 = (N-1) * N / 2

, therefore giving us the result that insertion sort has a *quadratic order of growth*

the order of growth for this alogorithm depends on the cases, and if we are basing it off the fact that it isnt the best case, and the while loop is ran then it is quadratic, 

otherwise if it is the best case(where the array is already sorted and the while loop does not have to be ran), then the insertion sort algorithm will have a *linear growth


