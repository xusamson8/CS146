### Insertion Sort Asymptotic Notation

Best Case: The best case for this sorting algorithm would be when everything in the array is alraedy in order / sorted. The Algorithm would perform n-1 comparisons (outer for loop & both the upper bound andlower bound are n-1 since it has to check that many elements one time to make sure its already sorted), and perform no swaps giving us a best case of **Θ(N)**

Average Case: The average case for insertion sort would probably be if it was halfway sorted, or if the while loop only needs to be ran half the time. To find out the time, we would have to add up all the lines of code, which was figured out in the previous homework. The most important part of this is the while loop (which can have i ranges from 1 to N-1. Which can be expressed as a series: 1 + 2 + 3 + ... + (N-1) ) that sum equals (N-1) * N / 2. If you add everything up it is still a polynomial of ax^2 + bx + c , by taking the largest term and ignoring the rest we get average case of **Θ(N^2)**

Worst Case: The worst case for this algorithm would be if everything had to be compared, everything is in reverse order and nothing is sorted in the beginning (besides what we're assuming is sorted; the first element) As we figured out in the last homework, adding up all the lines of codes and their run time would give us some polynomial of ax^2 + bx + c, and the while loop would run the maximum amount of times. The most siginificant term which is ax^2 would dominate as N grows, so we can ignore other terms, which would make the worst case **Θ(N^2)**


### Matrices Multiplication Asymptotic Notation 

By our last homework, I calculated the growth of the Matrix Multiplication Algorithm, which starts off with (rows_A * cols_B cells) that is already given. And we stil have to do the inner loop which is cols_A, resulting in a total time of (rows_A * cols_B * cols_A)

Since this isn't like sorting or searching, and every cell has to be multiplied and added up, every case (besdies edge case) should have the same time. which is O(rows_A * cols_B * cols_A). If we say that the size of each matrix is an aribitrary number N then it would be O(N^3).

Best Case: **O(N^3)** ; note: could be *considered* O(1) due to early termination (first line)

Average Case: **O(N^3)**

Worst Case: **O(N^3)**