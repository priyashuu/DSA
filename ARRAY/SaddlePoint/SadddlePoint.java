import java.util.Scanner;

public class SadddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[10][10];
        int i, j, c = 0, f = 0, n;
        System.out.print("Enter the no of rows or columns : ");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("Enter the no in pocket [ " + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
            }

        }
        System.out.println("the matrix will be ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
int min , max;
        for (i = 0; i < n; i++) {
             min = a[i][0];
            c = 0;
            for (j = 0; j < n; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    c=j;

                }

            }
            max = a[0][c] ;
            for (int k=0 ;k <n ;k++) {
                if (a[k][c] > max){
                    max = a[k] [c];
                }
                
            }
            if (min== max){
                f++;
            }
            if (f>0 ){
                System.out.println("found ");
            }
            
            
        }
        if (f== 0 ) {
            System.out.println("Saddle Point is not found ");
        }
    }
}
