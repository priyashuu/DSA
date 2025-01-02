public class TailRecursionExample {

    // Tail recursive function to calculate factorial
    // public static int factorialTail(int n, int accumulator) {
    //     if (n == 0) {
    //         return accumulator; // Base case
    //     }
    //     return factorialTail(n - 1, n * accumulator); // Recursive call at the end
    // }

    // public static void main(String[] args) {
    //     int n = 5;
    //     System.out.println("Factorial of " + n + " is: " + factorialTail(n, 1));
    // }
    public static void  fun(int n) {
        if (n == 0) {
            return ;
        }
        else {
            System.out.println(n);
            fun(n-1);
        }
    }
    public static void main(String[] args) {
        
       System.out.println("the numbers will be \n" );
       fun(5);
    }
}
