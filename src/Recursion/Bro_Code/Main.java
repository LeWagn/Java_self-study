package Recursion.Bro_Code;

public class Main {
    public static void main(String[] args) {

        // recursion = When a thing is defined in terms of itself.
        //			   Apply the result of a procedure, to a procedure.  
        //			   A recursive method calls itself. Can be a substitute for iteration.
        //			   Divide a problem into sub-problems of the same type as the original.
        //			   Commonly used with advanced sorting algorithms and navigating trees

        //			   Advantages
        //			   ----------
        //			   easier to read/write
        //			   easier to debug

        //			   Disadvantages
        //			   ----------
        //			   sometimes slower
        //			   uses more memory
        walk(5);

        //walk(10000000) would cause StackOverflow.

        //factorial example: (7*6*5*4*3*2*1)
        System.out.println(factorial(7));

        //Power Example (x^y)
        System.out.println(power(2, 8));
    }

    private static void walk(int steps) {
        //Iteratively:
        /*for (int i = 0; i < steps; i++) {
            System.out.println("You Take a Step");
        }*/

        //Recursively:
        if (steps < 1)
            return; //Base Case
        System.out.println("You Take a step!");
        walk(steps - 1); //recursive case

        //Call-Stack:
        //Calling the main Method, then walk(5), walk(4), ... walk(0);
    }
    
    private static int factorial(int num) {
        if (num < 1)
            return 1; //base case, will hit that once num is 0.
        return num * factorial(num - 1); //recursive case

    }
    
    private static int power(int base, int exponent) {
        if (exponent < 1)
            return 1; // base case;
        return base * power(base, exponent - 1);    //recursive case
    }
}
