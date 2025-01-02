
public class HeadRecursionExample {

    // Head recursive function to print numbers from 1 to n
    // public static void printNumbersHead(int n) {
    //     if (n == 0) {
    //         return; // Base case
    //     }
    //     printNumbersHead(n - 1); // Recursive call at the start
    //     System.out.println(n); // Operation after the recursive call
    // }

    // public static void main(String[] args) {
    //     int n = 5;
    //     System.out.println("Numbers from 1 to " + n + ":");
    //     printNumbersHead(n);
    // }
    public static void fun (int n ) {
        if (n ==0 ) {
            return ;
        }
        else {
            fun(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        fun(5);
    }
}

