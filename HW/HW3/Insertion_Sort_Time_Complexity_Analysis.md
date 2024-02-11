### Insertion Sort Time Complexity Analysis

```java
// lets say that this is the insertion sort algorithm in java below
public static int[] insertionSort(int[] A, int n){ // happens 1 time

    for( int i = 1 ; i < N ; i++>){ // happens n-1 times if we assume first element is sorted
        int key = A[i]; // n-1 times , bc inside outer for loop
        int j = i-1; // n-1 times

    while( j >= 0 ) && A[j] > key ){  //(n-1)( i times, i ranges from 1 to n-1)
        A[j+1] = A[j]; // same amt of times while loop condiiton is checked
        j = j-1; // same amt of times while loop condiiton is checked
    }
        A[j+1] = key; // n-1 times

    }
    return A; // 1 time
}
```

when we add these all up and base it on a worst case scenario where the while loops has to be ran, 
we will end up with a polynomial form > ax^2 + bx + c
, therefore giving us the result that insertion sort has a *quadratic order of growth*


