public class Fibonacci {
    public static int fibonacci(int n ){
        if( n == 0){
            return 0;
        }
        if ( n == 1){
            return 1;
        }

        //if it isnt the bases cases then move onto the loop
        int a = 0;
        int b = 1; //starting with the first two numnbers of fibonacci

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

    //explanation on the time complextity 
    /* 
     * the if statements, initializations , and return statements that are not within the for loop each are check a total 
     * of one time
     * 
     * we can calculate that the time complexity of this implementation is O(N), 
     * 
     * 
     * 
     */

}

