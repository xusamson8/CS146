public class EC1 {
    public static int fibonacci(int n ){
        if( n == 0){
            return 0;
        }
        if ( n == 1){
            return 1;
        }

        //if it isnt the bases cases then move onto the loop
        int a = 0;
        int b = 1; //starting with the first two numbers of fibonacci

        for( int i = 2; i <= n ; i++){
        //this loop gets the next number by summing up the previous elements, starting with 2
        //
            int next = a+b;
            a = b;
            b = next;
        }           
        return b;

    }         

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(9));
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
    }

    //explanation on the time complextity O(n) for iterative approach of fibonacci
    /* 
     * the if statements, initializations , and return statements that are not within the for loop each are check a total 
     * of one time, constant time 
     * 
     * we can calculate that the time complexity of this implementation is O(N), by adding that and the loop that iterates O(n-1)
     * times which can be simplified to O(n)
     * 
     * (the loop goes from 2 to n inclusive ), is n-1 b/c say n=4, will run i=2,3,4 ; if n=2, will do 2, on and on...?
     * 
     * where as in a recursive implementation it is not O(n)...
     * for example lets say we did this recursively, like this...
     * calling .. fibonacci(n-1) + fibonacci(n-2) which is a common way of doing fibonacci, 
     * it would result in the time complexity not being O(n) because of the function calls itself twice each interval.
     * 
     */

}

